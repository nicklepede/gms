package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.cxex;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class TimeEntity extends AbstractSafeParcelable implements Time {
    public static final Parcelable.Creator CREATOR = new cxex();
    public final Integer a;
    public final Integer b;
    public final Integer c;

    public TimeEntity(Integer num, Integer num2, Integer num3) {
        this.a = num;
        this.b = num2;
        this.c = num3;
    }

    public static int b(Time time) {
        return Arrays.hashCode(new Object[]{time.a(), time.c(), time.d()});
    }

    public static boolean e(Time time, Time time2) {
        return arwb.b(time.a(), time2.a()) && arwb.b(time.c(), time2.c()) && arwb.b(time.d(), time2.d());
    }

    @Override // com.google.android.gms.reminders.model.Time
    public final Integer a() {
        return this.a;
    }

    @Override // com.google.android.gms.reminders.model.Time
    public final Integer c() {
        return this.b;
    }

    @Override // com.google.android.gms.reminders.model.Time
    public final Integer d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Time)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return e(this, (Time) obj);
    }

    public final int hashCode() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxex.a(this, parcel);
    }

    public TimeEntity(Time time) {
        this(time.a(), time.c(), time.d());
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
