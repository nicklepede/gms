package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkmp;
import defpackage.dkmq;
import defpackage.dkmr;
import defpackage.dkms;
import defpackage.dkmt;
import defpackage.dkmu;
import defpackage.dkmv;
import defpackage.dkmw;
import defpackage.dkmx;
import defpackage.dkmy;
import defpackage.dkmz;
import defpackage.dkna;
import defpackage.dknb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class Barcode extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkmq();
    public int a;
    public String b;
    public String c;
    public int d;
    public Point[] e;
    public Email f;
    public Phone g;
    public Sms h;
    public WiFi i;
    public UrlBookmark j;
    public GeoPoint k;
    public CalendarEvent l;
    public ContactInfo m;
    public DriverLicense n;
    public byte[] o;
    public boolean p;
    public double q;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Address extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dkmp();
        public int a;
        public String[] b;

        public Address() {
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = atzr.a(parcel);
            atzr.o(parcel, 2, this.a);
            atzr.w(parcel, 3, this.b, false);
            atzr.c(parcel, a);
        }

        public Address(int i, String[] strArr) {
            this.a = i;
            this.b = strArr;
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class CalendarDateTime extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dkmr();
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public boolean g;
        public String h;

        public CalendarDateTime() {
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = atzr.a(parcel);
            atzr.o(parcel, 2, this.a);
            atzr.o(parcel, 3, this.b);
            atzr.o(parcel, 4, this.c);
            atzr.o(parcel, 5, this.d);
            atzr.o(parcel, 6, this.e);
            atzr.o(parcel, 7, this.f);
            atzr.e(parcel, 8, this.g);
            atzr.v(parcel, 9, this.h, false);
            atzr.c(parcel, a);
        }

        public CalendarDateTime(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = z;
            this.h = str;
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class CalendarEvent extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dkms();
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public CalendarDateTime f;
        public CalendarDateTime g;

        public CalendarEvent() {
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = atzr.a(parcel);
            atzr.v(parcel, 2, this.a, false);
            atzr.v(parcel, 3, this.b, false);
            atzr.v(parcel, 4, this.c, false);
            atzr.v(parcel, 5, this.d, false);
            atzr.v(parcel, 6, this.e, false);
            atzr.t(parcel, 7, this.f, i, false);
            atzr.t(parcel, 8, this.g, i, false);
            atzr.c(parcel, a);
        }

        public CalendarEvent(String str, String str2, String str3, String str4, String str5, CalendarDateTime calendarDateTime, CalendarDateTime calendarDateTime2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = calendarDateTime;
            this.g = calendarDateTime2;
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class ContactInfo extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dkmt();
        public PersonName a;
        public String b;
        public String c;
        public Phone[] d;
        public Email[] e;
        public String[] f;
        public Address[] g;

        public ContactInfo() {
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = atzr.a(parcel);
            atzr.t(parcel, 2, this.a, i, false);
            atzr.v(parcel, 3, this.b, false);
            atzr.v(parcel, 4, this.c, false);
            atzr.J(parcel, 5, this.d, i);
            atzr.J(parcel, 6, this.e, i);
            atzr.w(parcel, 7, this.f, false);
            atzr.J(parcel, 8, this.g, i);
            atzr.c(parcel, a);
        }

        public ContactInfo(PersonName personName, String str, String str2, Phone[] phoneArr, Email[] emailArr, String[] strArr, Address[] addressArr) {
            this.a = personName;
            this.b = str;
            this.c = str2;
            this.d = phoneArr;
            this.e = emailArr;
            this.f = strArr;
            this.g = addressArr;
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class DriverLicense extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dkmu();
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        public String n;

        public DriverLicense() {
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = atzr.a(parcel);
            atzr.v(parcel, 2, this.a, false);
            atzr.v(parcel, 3, this.b, false);
            atzr.v(parcel, 4, this.c, false);
            atzr.v(parcel, 5, this.d, false);
            atzr.v(parcel, 6, this.e, false);
            atzr.v(parcel, 7, this.f, false);
            atzr.v(parcel, 8, this.g, false);
            atzr.v(parcel, 9, this.h, false);
            atzr.v(parcel, 10, this.i, false);
            atzr.v(parcel, 11, this.j, false);
            atzr.v(parcel, 12, this.k, false);
            atzr.v(parcel, 13, this.l, false);
            atzr.v(parcel, 14, this.m, false);
            atzr.v(parcel, 15, this.n, false);
            atzr.c(parcel, a);
        }

        public DriverLicense(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = str8;
            this.i = str9;
            this.j = str10;
            this.k = str11;
            this.l = str12;
            this.m = str13;
            this.n = str14;
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Email extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dkmv();
        public int a;
        public String b;
        public String c;
        public String d;

        public Email() {
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = atzr.a(parcel);
            atzr.o(parcel, 2, this.a);
            atzr.v(parcel, 3, this.b, false);
            atzr.v(parcel, 4, this.c, false);
            atzr.v(parcel, 5, this.d, false);
            atzr.c(parcel, a);
        }

        public Email(int i, String str, String str2, String str3) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class GeoPoint extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dkmw();
        public double a;
        public double b;

        public GeoPoint() {
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = atzr.a(parcel);
            atzr.j(parcel, 2, this.a);
            atzr.j(parcel, 3, this.b);
            atzr.c(parcel, a);
        }

        public GeoPoint(double d, double d2) {
            this.a = d;
            this.b = d2;
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class PersonName extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dkmx();
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;

        public PersonName() {
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = atzr.a(parcel);
            atzr.v(parcel, 2, this.a, false);
            atzr.v(parcel, 3, this.b, false);
            atzr.v(parcel, 4, this.c, false);
            atzr.v(parcel, 5, this.d, false);
            atzr.v(parcel, 6, this.e, false);
            atzr.v(parcel, 7, this.f, false);
            atzr.v(parcel, 8, this.g, false);
            atzr.c(parcel, a);
        }

        public PersonName(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Phone extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dkmy();
        public int a;
        public String b;

        public Phone() {
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = atzr.a(parcel);
            atzr.o(parcel, 2, this.a);
            atzr.v(parcel, 3, this.b, false);
            atzr.c(parcel, a);
        }

        public Phone(int i, String str) {
            this.a = i;
            this.b = str;
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Sms extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dkmz();
        public String a;
        public String b;

        public Sms() {
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = atzr.a(parcel);
            atzr.v(parcel, 2, this.a, false);
            atzr.v(parcel, 3, this.b, false);
            atzr.c(parcel, a);
        }

        public Sms(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class UrlBookmark extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dkna();
        public String a;
        public String b;

        public UrlBookmark() {
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = atzr.a(parcel);
            atzr.v(parcel, 2, this.a, false);
            atzr.v(parcel, 3, this.b, false);
            atzr.c(parcel, a);
        }

        public UrlBookmark(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class WiFi extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dknb();
        public String a;
        public String b;
        public int c;

        public WiFi() {
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = atzr.a(parcel);
            atzr.v(parcel, 2, this.a, false);
            atzr.v(parcel, 3, this.b, false);
            atzr.o(parcel, 4, this.c);
            atzr.c(parcel, a);
        }

        public WiFi(String str, String str2, int i) {
            this.a = str;
            this.b = str2;
            this.c = i;
        }
    }

    public Barcode() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.o(parcel, 5, this.d);
        atzr.J(parcel, 6, this.e, i);
        atzr.t(parcel, 7, this.f, i, false);
        atzr.t(parcel, 8, this.g, i, false);
        atzr.t(parcel, 9, this.h, i, false);
        atzr.t(parcel, 10, this.i, i, false);
        atzr.t(parcel, 11, this.j, i, false);
        atzr.t(parcel, 12, this.k, i, false);
        atzr.t(parcel, 13, this.l, i, false);
        atzr.t(parcel, 14, this.m, i, false);
        atzr.t(parcel, 15, this.n, i, false);
        atzr.i(parcel, 16, this.o, false);
        atzr.e(parcel, 17, this.p);
        atzr.j(parcel, 18, this.q);
        atzr.c(parcel, a);
    }

    public Barcode(int i, String str, String str2, int i2, Point[] pointArr, Email email, Phone phone, Sms sms, WiFi wiFi, UrlBookmark urlBookmark, GeoPoint geoPoint, CalendarEvent calendarEvent, ContactInfo contactInfo, DriverLicense driverLicense, byte[] bArr, boolean z, double d) {
        this.a = i;
        this.b = str;
        this.o = bArr;
        this.c = str2;
        this.d = i2;
        this.e = pointArr;
        this.p = z;
        this.q = d;
        this.f = email;
        this.g = phone;
        this.h = sms;
        this.i = wiFi;
        this.j = urlBookmark;
        this.k = geoPoint;
        this.l = calendarEvent;
        this.m = contactInfo;
        this.n = driverLicense;
    }
}
