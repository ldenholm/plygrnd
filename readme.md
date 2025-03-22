This repository serves as a playground for me to experiment with design patterns.
I am currently experiementing with CQRS and event sourcing.

The project models sc2 Terran buildings, units and their fictional production and upkeep.

Note the commands are not processor bound, and so we
simply make use of asynchronous tasks vs multithreading.

Todo:
- Embed Apache Artemis so we don't need a docker setup
- Explore using binary heap for building task execution sequence.
For example have a buffer of size n (the binary heap) which evaluates task
cost to compute (time) then construct an order of execution to minimize the cost (time).
