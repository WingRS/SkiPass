# SkiPass HomeWork 
This is a SkiPasss system that realizes :

# Tourniquet
  Realizes passing users through it by validatin SkiPasses
  Must be using system that creates SkiPasses ( a factory ).
# SkiPass
  - id
  - type
  - count of rides ( days ) 
  - user
  
  I divided this realization into two parts ( Strategy pattern for counting days and cycles)
  So, the task was:
  
  Realize such SkiPassses:
  
    Working days:
    
      - unlimited: for a day; for two days; 5 days;
      - cycles: 10 cycles, 20 cycles,50 cycles, 100  cycles.
    Weekend days:
    
      - unlimited: for a day; for two days; 5 days;
      - cycles: 10 cycles, 20 cycles,50 cycles, 100  cycles.
      - for a season
# SkiPassFactory
    - create one of SkiPass type;
    - ban SkiPass.
  
