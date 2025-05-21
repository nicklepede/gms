package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.RecurrenceStart;
import com.google.android.gms.reminders.model.RecurrenceStartEntity;
import defpackage.cxeb;
import defpackage.cxes;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RecurrenceStartRef extends cxeb implements RecurrenceStart {
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

    @Override // defpackage.arnw
    public final boolean equals(Object obj) {
        if (!(obj instanceof RecurrenceStart)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return RecurrenceStartEntity.c(this, (RecurrenceStart) obj);
    }

    @Override // defpackage.arnw
    public final int hashCode() {
        return RecurrenceStartEntity.b(this);
    }

    @Override // defpackage.arnw, defpackage.arod
    public final /* synthetic */ Object l() {
        return new RecurrenceStartEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxes.a(new RecurrenceStartEntity(this), parcel, i);
    }
}
