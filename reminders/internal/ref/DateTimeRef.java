package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.DateTimeEntity;
import com.google.android.gms.reminders.model.Time;
import defpackage.cznx;
import defpackage.czoe;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class DateTimeRef extends cznx implements DateTime {
    private boolean f;
    private TimeRef g;

    public DateTimeRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
        this.f = false;
    }

    public static boolean k(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.f(G(str, "year"), i, i2) && dataHolder.f(G(str, "month"), i, i2) && dataHolder.f(G(str, "day"), i, i2) && TimeRef.e(dataHolder, i, i2, str) && dataHolder.f(G(str, "period"), i, i2) && dataHolder.f(G(str, "date_range"), i, i2) && dataHolder.f(G(str, "absolute_time_ms"), i, i2) && dataHolder.f(G(str, "unspecified_future_time"), i, i2) && dataHolder.f(G(str, "all_day"), i, i2);
    }

    @Override // com.google.android.gms.reminders.model.DateTime
    public final Time a() {
        if (!this.f) {
            this.f = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (TimeRef.e(dataHolder, i, i2, str)) {
                this.g = null;
            } else {
                this.g = new TimeRef(dataHolder, this.b, str);
            }
        }
        return this.g;
    }

    @Override // com.google.android.gms.reminders.model.DateTime
    public final Boolean c() {
        return Boolean.valueOf(t(p("all_day")));
    }

    @Override // com.google.android.gms.reminders.model.DateTime
    public final Boolean d() {
        return Boolean.valueOf(t(p("unspecified_future_time")));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.reminders.model.DateTime
    public final Integer e() {
        return n(p("date_range"));
    }

    @Override // defpackage.atql
    public final boolean equals(Object obj) {
        if (!(obj instanceof DateTime)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return DateTimeEntity.k(this, (DateTime) obj);
    }

    @Override // com.google.android.gms.reminders.model.DateTime
    public final Integer f() {
        return n(p("day"));
    }

    @Override // com.google.android.gms.reminders.model.DateTime
    public final Integer g() {
        return n(p("month"));
    }

    @Override // com.google.android.gms.reminders.model.DateTime
    public final Integer h() {
        return n(p("period"));
    }

    @Override // defpackage.atql
    public final int hashCode() {
        return DateTimeEntity.b(this);
    }

    @Override // com.google.android.gms.reminders.model.DateTime
    public final Integer i() {
        return n(p("year"));
    }

    @Override // com.google.android.gms.reminders.model.DateTime
    public final Long j() {
        return o(p("absolute_time_ms"));
    }

    @Override // defpackage.atql, defpackage.atqs
    public final /* synthetic */ Object l() {
        return new DateTimeEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czoe.a(new DateTimeEntity(this), parcel, i);
    }
}
