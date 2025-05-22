package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.czoe;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class DateTimeEntity extends AbstractSafeParcelable implements DateTime {
    public static final Parcelable.Creator CREATOR = new czoe();
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final TimeEntity d;
    public final Integer e;
    public final Integer f;
    public final Long g;
    public final Boolean h;
    public final Boolean i;

    public DateTimeEntity(Integer num, Integer num2, Integer num3, TimeEntity timeEntity, Integer num4, Integer num5, Long l, Boolean bool, Boolean bool2) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = timeEntity;
        this.e = num4;
        this.f = num5;
        this.g = l;
        this.h = bool;
        this.i = bool2;
    }

    public static int b(DateTime dateTime) {
        return Arrays.hashCode(new Object[]{dateTime.i(), dateTime.g(), dateTime.f(), dateTime.a(), dateTime.h(), dateTime.e(), dateTime.j(), dateTime.d(), dateTime.c()});
    }

    public static boolean k(DateTime dateTime, DateTime dateTime2) {
        return atyq.b(dateTime.i(), dateTime2.i()) && atyq.b(dateTime.g(), dateTime2.g()) && atyq.b(dateTime.f(), dateTime2.f()) && atyq.b(dateTime.a(), dateTime2.a()) && atyq.b(dateTime.h(), dateTime2.h()) && atyq.b(dateTime.e(), dateTime2.e()) && atyq.b(dateTime.j(), dateTime2.j()) && atyq.b(dateTime.d(), dateTime2.d()) && atyq.b(dateTime.c(), dateTime2.c());
    }

    @Override // com.google.android.gms.reminders.model.DateTime
    public final Time a() {
        return this.d;
    }

    @Override // com.google.android.gms.reminders.model.DateTime
    public final Boolean c() {
        return this.i;
    }

    @Override // com.google.android.gms.reminders.model.DateTime
    public final Boolean d() {
        return this.h;
    }

    @Override // com.google.android.gms.reminders.model.DateTime
    public final Integer e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DateTime)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return k(this, (DateTime) obj);
    }

    @Override // com.google.android.gms.reminders.model.DateTime
    public final Integer f() {
        return this.c;
    }

    @Override // com.google.android.gms.reminders.model.DateTime
    public final Integer g() {
        return this.b;
    }

    @Override // com.google.android.gms.reminders.model.DateTime
    public final Integer h() {
        return this.e;
    }

    public final int hashCode() {
        return b(this);
    }

    @Override // com.google.android.gms.reminders.model.DateTime
    public final Integer i() {
        return this.a;
    }

    @Override // com.google.android.gms.reminders.model.DateTime
    public final Long j() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czoe.a(this, parcel, i);
    }

    public DateTimeEntity(DateTime dateTime) {
        this(dateTime.i(), dateTime.g(), dateTime.f(), dateTime.a(), dateTime.h(), dateTime.e(), dateTime.j(), dateTime.d(), dateTime.c(), false);
    }

    public DateTimeEntity(Integer num, Integer num2, Integer num3, Time time, Integer num4, Integer num5, Long l, Boolean bool, Boolean bool2, boolean z) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.e = num4;
        this.f = num5;
        this.g = l;
        this.h = bool;
        this.i = bool2;
        if (z) {
            this.d = (TimeEntity) time;
        } else {
            this.d = time == null ? null : new TimeEntity(time);
        }
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
