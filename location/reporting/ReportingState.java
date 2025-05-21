package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cakz;
import defpackage.cala;
import defpackage.calf;
import defpackage.calo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ReportingState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new calf();
    public final boolean a;
    public final boolean b;
    public final Integer c;
    public final boolean d;
    public final boolean e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    public ReportingState(int i, int i2, boolean z, boolean z2, int i3, int i4, Integer num, boolean z3, boolean z4) {
        this.f = i;
        this.g = i2;
        this.a = z;
        this.b = z2;
        this.h = i3;
        this.i = i4;
        this.c = num;
        this.d = z3;
        this.e = z4;
    }

    public final int a() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        throw new SecurityException("Device tag restricted to approved apps");
    }

    public final int b() {
        return cakz.a(this.h);
    }

    public final int c() {
        return cala.a(this.g);
    }

    public final int d() {
        return cala.a(this.f);
    }

    public final boolean e() {
        return cala.b(this.f) && cala.b(this.g);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ReportingState)) {
            return false;
        }
        ReportingState reportingState = (ReportingState) obj;
        return this.f == reportingState.f && this.g == reportingState.g && this.a == reportingState.a && this.b == reportingState.b && this.h == reportingState.h && this.i == reportingState.i && arwb.b(this.c, reportingState.c) && this.d == reportingState.d && this.e == reportingState.e;
    }

    public final boolean f() {
        return !e() && b() == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.h), Integer.valueOf(this.i), this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    public final String toString() {
        Integer num = this.c;
        String d = num != null ? calo.d(num) : "(hidden-from-unauthorized-caller)";
        return "ReportingState{reportingEnabled=" + this.f + ", historyEnabled=" + this.g + ", allowed=" + this.a + ", active=" + this.b + ", expectedOptInResult=" + this.h + ", expectedOptInResultAssumingLocationEnabled=" + this.i + ", deviceTag=" + d + ", canAccessSettings=" + this.d + ", hasMigratedToOdlh=" + this.e + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, d());
        arxc.o(parcel, 3, c());
        arxc.e(parcel, 4, this.a);
        arxc.e(parcel, 5, this.b);
        arxc.o(parcel, 7, b());
        arxc.F(parcel, 8, this.c);
        arxc.o(parcel, 9, cakz.a(this.i));
        arxc.e(parcel, 10, this.d);
        arxc.e(parcel, 11, this.e);
        arxc.c(parcel, a);
    }
}
