# libev
DESCRIPTION = "Event Loop Libaray"
HOMEPAGE = "http://software.schmorp.de/pkg/libev.html"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d6ad416afd040c90698edcdf1cbee347"
SRC_URI = "http://dist.schmorp.de/libev/Attic/libev-${PV}.tar.gz \
           file://libev-4.19-Modernize-the-configure.ac.patch \
           file://libev-4.19-Respect-the-CFLAGS-if-defined.patch"
PR = "r1"

inherit autotools-brokensep

SRC_URI[md5sum] = "01d1c672697f649b4f94abd0b70584ff"
SRC_URI[sha256sum] = "88fc5f89ca96ceca14c16c10e7be3e921dae65e84932d680c2fd6a40173edccb"

# patches imported from Fedora rpms
# event.h is removed intentionaly, because is there only for
# backward compatibility with libevent
do_install_append() {
    rm -f ${D}/${includedir}/event.h
}
