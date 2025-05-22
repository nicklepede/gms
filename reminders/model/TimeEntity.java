package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.czot;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class TimeEntity extends AbstractSafeParcelable implements Time {
    public static final Parcelable.Creator CREATOR = new czot();
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
        return atyq.b(time.a(), time2.a()) && atyq.b(time.c(), time2.c()) && atyq.b(time.d(), time2.d());
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
        czot.a(this, parcel);
    }

    public TimeEntity(Time time) {
        this(time.a(), time.c(), time.d());
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
