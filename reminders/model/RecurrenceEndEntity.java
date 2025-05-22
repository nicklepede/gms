package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.czom;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RecurrenceEndEntity extends AbstractSafeParcelable implements RecurrenceEnd {
    public static final Parcelable.Creator CREATOR = new czom();
    public final DateTimeEntity a;
    public final Integer b;
    public final Boolean c;
    public final DateTimeEntity d;

    public RecurrenceEndEntity(DateTimeEntity dateTimeEntity, Integer num, Boolean bool, DateTimeEntity dateTimeEntity2) {
        this.a = dateTimeEntity;
        this.b = num;
        this.c = bool;
        this.d = dateTimeEntity2;
    }

    public static int b(RecurrenceEnd recurrenceEnd) {
        return Arrays.hashCode(new Object[]{recurrenceEnd.c(), recurrenceEnd.e(), recurrenceEnd.d(), recurrenceEnd.a()});
    }

    public static boolean f(RecurrenceEnd recurrenceEnd, RecurrenceEnd recurrenceEnd2) {
        return atyq.b(recurrenceEnd.c(), recurrenceEnd2.c()) && atyq.b(recurrenceEnd.e(), recurrenceEnd2.e()) && atyq.b(recurrenceEnd.d(), recurrenceEnd2.d()) && atyq.b(recurrenceEnd.a(), recurrenceEnd2.a());
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceEnd
    public final DateTime a() {
        return this.d;
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceEnd
    public final DateTime c() {
        return this.a;
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceEnd
    public final Boolean d() {
        return this.c;
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceEnd
    public final Integer e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RecurrenceEnd)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return f(this, (RecurrenceEnd) obj);
    }

    public final int hashCode() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czom.a(this, parcel, i);
    }

    public RecurrenceEndEntity(DateTime dateTime, Integer num, Boolean bool, DateTime dateTime2, boolean z) {
        this.b = num;
        this.c = bool;
        if (z) {
            this.a = (DateTimeEntity) dateTime;
            this.d = (DateTimeEntity) dateTime2;
        } else {
            this.a = dateTime == null ? null : new DateTimeEntity(dateTime);
            this.d = dateTime2 != null ? new DateTimeEntity(dateTime2) : null;
        }
    }

    public RecurrenceEndEntity(RecurrenceEnd recurrenceEnd) {
        this(recurrenceEnd.c(), recurrenceEnd.e(), recurrenceEnd.d(), recurrenceEnd.a(), false);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
