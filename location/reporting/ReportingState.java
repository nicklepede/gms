package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cctp;
import defpackage.cctq;
import defpackage.cctv;
import defpackage.ccue;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ReportingState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cctv();
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
        return cctp.a(this.h);
    }

    public final int c() {
        return cctq.a(this.g);
    }

    public final int d() {
        return cctq.a(this.f);
    }

    public final boolean e() {
        return cctq.b(this.f) && cctq.b(this.g);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ReportingState)) {
            return false;
        }
        ReportingState reportingState = (ReportingState) obj;
        return this.f == reportingState.f && this.g == reportingState.g && this.a == reportingState.a && this.b == reportingState.b && this.h == reportingState.h && this.i == reportingState.i && atyq.b(this.c, reportingState.c) && this.d == reportingState.d && this.e == reportingState.e;
    }

    public final boolean f() {
        return !e() && b() == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.h), Integer.valueOf(this.i), this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    public final String toString() {
        Integer num = this.c;
        String d = num != null ? ccue.d(num) : "(hidden-from-unauthorized-caller)";
        return "ReportingState{reportingEnabled=" + this.f + ", historyEnabled=" + this.g + ", allowed=" + this.a + ", active=" + this.b + ", expectedOptInResult=" + this.h + ", expectedOptInResultAssumingLocationEnabled=" + this.i + ", deviceTag=" + d + ", canAccessSettings=" + this.d + ", hasMigratedToOdlh=" + this.e + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, d());
        atzr.o(parcel, 3, c());
        atzr.e(parcel, 4, this.a);
        atzr.e(parcel, 5, this.b);
        atzr.o(parcel, 7, b());
        atzr.F(parcel, 8, this.c);
        atzr.o(parcel, 9, cctp.a(this.i));
        atzr.e(parcel, 10, this.d);
        atzr.e(parcel, 11, this.e);
        atzr.c(parcel, a);
    }
}
