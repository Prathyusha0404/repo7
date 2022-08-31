LocalDate start = LocalDate.now();
LocalDate end = LocalDate.now().plusMonths(1).with(TemporalAdjusters.lastDayOfMonth());
 
//Create stream of dates
List<LocalDate> dates = Stream.iterate(start, date -> date.plusDays(1))
                .limit(ChronoUnit.DAYS.between(start, end))
                .collect(Collectors.toList());
 
// Get Min or Max Date
LocalDate maxDate = dates.stream()
              .max( Comparator.comparing( LocalDate::toEpochDay ) )
              .get();
 
LocalDate minDate = dates.stream()
              .min( Comparator.comparing( LocalDate::toEpochDay ) )
              .get();
