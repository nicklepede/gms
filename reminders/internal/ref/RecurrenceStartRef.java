package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.RecurrenceStart;
import com.google.android.gms.reminders.model.RecurrenceStartEntity;
import defpackage.cznx;
import defpackage.czoo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RecurrenceStartRef extends cznx implements RecurrenceStart {
    private boolean f;
    private DateTimeRef g;

    public RecurrenceStartRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
        this.f = false;
    }

    public static boolean c(DataHolder dataHolder, int i, int i2, String str) {
        return DateTimeRef.k(dataHolder, i, i2, str.concat("recurrence_start_"));
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceStart
    public final DateTime a() {
        if (!this.f) {
            this.f = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (DateTimeRef.k(dataHolder, i, i2, str.concat("recurrence_start_"))) {
                this.g = null;
            } else {
                this.g = new DateTimeRef(dataHolder, this.b, str.concat("recurrence_start_"));
            }
        }
        return this.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.atql
    public final boolean equals(Object obj) {
        if (!(obj instanceof RecurrenceStart)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return RecurrenceStartEntity.c(this, (RecurrenceStart) obj);
    }

    @Override // defpackage.atql
    public final int hashCode() {
        return RecurrenceStartEntity.b(this);
    }

    @Override // defpackage.atql, defpackage.atqs
    public final /* synthetic */ Object l() {
        return new RecurrenceStartEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czoo.a(new RecurrenceStartEntity(this), parcel, i);
    }
}
