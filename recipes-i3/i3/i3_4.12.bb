#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Simple helloworld application"
SECTION = "examples"
DEPENDS = ""
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aef170fc05d52394602b24da705af626"

#FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

DEPENDS = " libev \
    libxkbcommon \
    pango \
    startup-notification \
    xcb-util-cursor \
    xcb-util-keysyms \
    xcb-util-wm \
    yajl \
    pkgconfig \
    "

SRCREV = "c9f0bc174d0746c925443d49bcc07727b631e335"
SRC_URI = "git://github.com/i3/i3.git"

S = "${WORKDIR}/git"

inherit autotools

