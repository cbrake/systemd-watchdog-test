cmake_minimum_required (VERSION 2.6)
#project(Systemd Watchdog Test)
add_executable(systemd-watchdog-test main.c)
#include(UsePkgConfig)
find_package(PkgConfig)
pkg_check_modules(SYSTEMD libsystemd-daemon)
target_link_libraries(systemd-watchdog-test ${SYSTEMD_LDFLAGS})
install (TARGETS systemd-watchdog-test DESTINATION bin)
install (FILES systemd-watchdog-test.service DESTINATION /lib/systemd/system)


