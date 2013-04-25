DESCRIPTION = "Systemd Watchdog Test"
HOMEPAGE = "https://github.com/cbrake/systemd-watchdog-test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.MIT;md5=544799d0b492f119fa04641d1b8868ed"

inherit cmake

SRCREV = "671bb091ba0b3acfe7f9be6ddf6fbfa4655490c7"
PV = "0.1+gitr${SRCPV}"
PR = "r4"

SRC_URI = "git://github.com/cbrake/systemd-watchdog-test;protocol=git;branch=master"

S = "${WORKDIR}/git"

FILES_${PN} += "/lib/systemd/system/"



