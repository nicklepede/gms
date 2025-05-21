package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.cxen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class MonthlyPatternEntity extends AbstractSafeParcelable implements MonthlyPattern {
    public static final Parcelable.Creator CREATOR = new cxen();
    public final List a;
    public final Integer b;
    public final Integer c;

    public MonthlyPatternEntity(List list, Integer num, Integer num2) {
        this.a = list;
        this.b = num;
        this.c = num2;
    }

    public static int b(MonthlyPattern monthlyPattern) {
        return Arrays.hashCode(new Object[]{monthlyPattern.d(), monthlyPattern.a(), monthlyPattern.c()});
    }

    public static boolean e(MonthlyPattern monthlyPattern, MonthlyPattern monthlyPattern2) {
        return arwb.b(monthlyPattern.d(), monthlyPattern2.d()) && arwb.b(monthlyPattern.a(), monthlyPattern2.a()) && arwb.b(monthlyPattern.c(), monthlyPattern2.c());
    }

    @Override // com.google.android.gms.reminders.model.MonthlyPattern
    public final Integer a() {
        return this.b;
    }

    @Override // com.google.android.gms.reminders.model.MonthlyPattern
    public final Integer c() {
        return this.c;
    }

    @Override // com.google.android.gms.reminders.model.MonthlyPattern
    public final List d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MonthlyPattern)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return e(this, (MonthlyPattern) obj);
    }

    public final int hashCode() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxen.a(this, parcel);
    }

    public MonthlyPatternEntity(MonthlyPattern monthlyPattern) {
        List d = monthlyPattern.d();
        Integer a = monthlyPattern.a();
        Integer c = monthlyPattern.c();
        this.b = a;
        this.c = c;
        this.a = d == null ? null : new ArrayList(d);
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
