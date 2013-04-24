systemd-watchdog-test
=====================

Systemd Watchdog Test application

This can be used to run various tests with the systemd watchdog.

Install
=======

* mkdir build
* cd build
* cmake ../
* sudo make install
* sudo systemctl --system daemon-reload
* sudo systemctl start systemd-watchdog-test
