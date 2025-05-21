package com.google.android.gms.car;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.telecom.GatewayInfo;
import android.telecom.PhoneAccountHandle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.akpr;
import defpackage.akps;
import defpackage.arxc;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CarCall extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akpr();
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

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class Details extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new akps();
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
            int a = arxc.a(parcel);
            arxc.t(parcel, 1, this.a, i, false);
            arxc.v(parcel, 2, this.b, false);
            arxc.v(parcel, 3, this.c, false);
            arxc.q(parcel, 4, this.d);
            arxc.t(parcel, 5, this.e, i, false);
            arxc.t(parcel, 6, this.f, i, false);
            arxc.o(parcel, 7, this.g);
            arxc.t(parcel, 8, this.h, i, false);
            arxc.o(parcel, 9, this.i);
            arxc.g(parcel, 10, this.j, false);
            arxc.g(parcel, 11, this.k, false);
            arxc.o(parcel, 12, this.l);
            arxc.t(parcel, 13, this.m, i, false);
            arxc.c(parcel, a);
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.x(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.o(parcel, 5, this.e);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.e(parcel, 7, this.g);
        arxc.y(parcel, 8, this.h, false);
        arxc.y(parcel, 9, this.i, false);
        arxc.c(parcel, a);
    }
}
