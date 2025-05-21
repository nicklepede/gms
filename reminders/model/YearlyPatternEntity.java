package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.cxez;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class YearlyPatternEntity extends AbstractSafeParcelable implements YearlyPattern {
    public static final Parcelable.Creator CREATOR = new cxez();
    public final MonthlyPatternEntity a;
    public final List b;

    public YearlyPatternEntity(MonthlyPatternEntity monthlyPatternEntity, List list) {
        this.a = monthlyPatternEntity;
        this.b = list;
    }

    public static int b(YearlyPattern yearlyPattern) {
        return Arrays.hashCode(new Object[]{yearlyPattern.a(), yearlyPattern.c()});
    }

    public static boolean d(YearlyPattern yearlyPattern, YearlyPattern yearlyPattern2) {
        return arwb.b(yearlyPattern.a(), yearlyPattern2.a()) && arwb.b(yearlyPattern.c(), yearlyPattern2.c());
    }

    @Override // com.google.android.gms.reminders.model.YearlyPattern
    public final MonthlyPattern a() {
        return this.a;
    }

    @Override // com.google.android.gms.reminders.model.YearlyPattern
    public final List c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof YearlyPattern)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d(this, (YearlyPattern) obj);
    }

    public final int hashCode() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxez.a(this, parcel, i);
    }

    public YearlyPatternEntity(YearlyPattern yearlyPattern) {
        MonthlyPattern a = yearlyPattern.a();
        List c = yearlyPattern.c();
        this.a = a == null ? null : new MonthlyPatternEntity(a);
        this.b = c != null ? new ArrayList(c) : null;
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
