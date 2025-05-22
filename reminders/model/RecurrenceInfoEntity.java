package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.czon;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RecurrenceInfoEntity extends AbstractSafeParcelable implements RecurrenceInfo {
    public static final Parcelable.Creator CREATOR = new czon();
    public final RecurrenceEntity a;
    public final String b;
    public final Boolean c;
    public final Boolean d;

    public RecurrenceInfoEntity(RecurrenceEntity recurrenceEntity, String str, Boolean bool, Boolean bool2) {
        this.a = recurrenceEntity;
        this.b = str;
        this.c = bool;
        this.d = bool2;
    }

    public static int b(RecurrenceInfo recurrenceInfo) {
        return Arrays.hashCode(new Object[]{recurrenceInfo.a(), recurrenceInfo.e(), recurrenceInfo.d(), recurrenceInfo.c()});
    }

    public static boolean f(RecurrenceInfo recurrenceInfo, RecurrenceInfo recurrenceInfo2) {
        return atyq.b(recurrenceInfo.a(), recurrenceInfo2.a()) && atyq.b(recurrenceInfo.e(), recurrenceInfo2.e()) && atyq.b(recurrenceInfo.d(), recurrenceInfo2.d()) && atyq.b(recurrenceInfo.c(), recurrenceInfo2.c());
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceInfo
    public final Recurrence a() {
        return this.a;
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceInfo
    public final Boolean c() {
        return this.d;
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceInfo
    public final Boolean d() {
        return this.c;
    }

    @Override // com.google.android.gms.reminders.model.RecurrenceInfo
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RecurrenceInfo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return f(this, (RecurrenceInfo) obj);
    }

    public final int hashCode() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czon.a(this, parcel, i);
    }

    public RecurrenceInfoEntity(RecurrenceInfo recurrenceInfo) {
        Recurrence a = recurrenceInfo.a();
        String e = recurrenceInfo.e();
        Boolean d = recurrenceInfo.d();
        Boolean c = recurrenceInfo.c();
        this.b = e;
        this.c = d;
        this.d = c;
        this.a = a == null ? null : new RecurrenceEntity(a);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
