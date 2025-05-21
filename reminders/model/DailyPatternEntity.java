package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.cxeg;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class DailyPatternEntity extends AbstractSafeParcelable implements DailyPattern {
    public static final Parcelable.Creator CREATOR = new cxeg();
    public final TimeEntity a;
    public final Integer b;
    public final Boolean c;

    public DailyPatternEntity(TimeEntity timeEntity, Integer num, Boolean bool) {
        this.a = timeEntity;
        this.b = num;
        this.c = bool;
    }

    public static int b(DailyPattern dailyPattern) {
        return Arrays.hashCode(new Object[]{dailyPattern.a(), dailyPattern.d(), dailyPattern.c()});
    }

    public static boolean e(DailyPattern dailyPattern, DailyPattern dailyPattern2) {
        return arwb.b(dailyPattern.a(), dailyPattern2.a()) && arwb.b(dailyPattern.d(), dailyPattern2.d()) && arwb.b(dailyPattern.c(), dailyPattern2.c());
    }

    @Override // com.google.android.gms.reminders.model.DailyPattern
    public final Time a() {
        return this.a;
    }

    @Override // com.google.android.gms.reminders.model.DailyPattern
    public final Boolean c() {
        return this.c;
    }

    @Override // com.google.android.gms.reminders.model.DailyPattern
    public final Integer d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DailyPattern)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return e(this, (DailyPattern) obj);
    }

    public final int hashCode() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxeg.a(this, parcel, i);
    }

    public DailyPatternEntity(DailyPattern dailyPattern) {
        Time a = dailyPattern.a();
        Integer d = dailyPattern.d();
        Boolean c = dailyPattern.c();
        this.b = d;
        this.c = c;
        this.a = a == null ? null : new TimeEntity(a);
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
