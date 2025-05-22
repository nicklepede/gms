package com.google.android.gms.car;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.telecom.GatewayInfo;
import android.telecom.PhoneAccountHandle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amrc;
import defpackage.amrd;
import defpackage.atzr;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CarCall extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new amrc();
    public final int a;
    public CarCall b;
    public List c;
    public String d;
    public int e;
    public Details f;

    @Deprecated
    public boolean g;
    public final List h;
    public final List i;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Details extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new amrd();
        public Uri a;
        public String b;
        public String c;
        public long d;

        @Deprecated
        public Uri e;

        @Deprecated
        public Uri f;
        public int g;
        public PhoneAccountHandle h;
        public int i;
        public Bundle j;
        public Bundle k;
        public int l;
        public GatewayInfo m;

        public Details() {
        }

        public final String toString() {
            return "Details{handle=" + String.valueOf(this.a) + ", callerDisplayName='" + this.b + "', disconnectCause='" + this.c + "', connectTimeMillis=" + this.d + ", gatewayInfoOriginal=" + String.valueOf(this.e) + ", gatewayInfoGateway=" + String.valueOf(this.f) + ", callCapabilities=" + this.g + ", accountHandle=" + String.valueOf(this.h) + ", callProperties=" + this.i + ", extras=" + String.valueOf(this.j) + ", intentExtras=" + String.valueOf(this.k) + ", videoState=" + this.l + ", gatewayInfo=" + String.valueOf(this.m) + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = atzr.a(parcel);
            atzr.t(parcel, 1, this.a, i, false);
            atzr.v(parcel, 2, this.b, false);
            atzr.v(parcel, 3, this.c, false);
            atzr.q(parcel, 4, this.d);
            atzr.t(parcel, 5, this.e, i, false);
            atzr.t(parcel, 6, this.f, i, false);
            atzr.o(parcel, 7, this.g);
            atzr.t(parcel, 8, this.h, i, false);
            atzr.o(parcel, 9, this.i);
            atzr.g(parcel, 10, this.j, false);
            atzr.g(parcel, 11, this.k, false);
            atzr.o(parcel, 12, this.l);
            atzr.t(parcel, 13, this.m, i, false);
            atzr.c(parcel, a);
        }

        public Details(Uri uri, String str, String str2, long j, Uri uri2, Uri uri3, int i, PhoneAccountHandle phoneAccountHandle, int i2, Bundle bundle, Bundle bundle2, int i3, GatewayInfo gatewayInfo) {
            this.a = uri;
            this.b = str;
            this.c = str2;
            this.d = j;
            this.e = uri2;
            this.f = uri3;
            this.g = i;
            this.h = phoneAccountHandle;
            this.i = i2;
            this.j = bundle;
            this.k = bundle2;
            this.l = i3;
            this.m = gatewayInfo;
        }
    }

    public CarCall(int i, CarCall carCall, List list, String str, int i2, Details details, boolean z, List list2, List list3) {
        this.a = i;
        this.b = carCall;
        this.c = list;
        this.d = str;
        this.e = i2;
        this.f = details;
        this.g = z;
        this.h = list2;
        this.i = list3;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof CarCall) && this.a == ((CarCall) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "CarCall{id=" + this.a + ", parent=" + String.valueOf(this.b) + ", cannedTextResponses=" + String.valueOf(this.c) + ", remainingPostDialSequence='" + this.d + "', state=" + this.e + ", details=" + String.valueOf(this.f) + ", hasChildren=" + this.g + ", children=" + String.valueOf(this.h) + ", conferenceableCalls=" + String.valueOf(this.i) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.x(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.o(parcel, 5, this.e);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.e(parcel, 7, this.g);
        atzr.y(parcel, 8, this.h, false);
        atzr.y(parcel, 9, this.i, false);
        atzr.c(parcel, a);
    }
}
