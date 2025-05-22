package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.czou;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class WeeklyPatternEntity extends AbstractSafeParcelable implements WeeklyPattern {
    public static final Parcelable.Creator CREATOR = new czou();
    public final List a;

    public WeeklyPatternEntity(List list) {
        this.a = list;
    }

    public static int b(WeeklyPattern weeklyPattern) {
        return Arrays.hashCode(new Object[]{weeklyPattern.a()});
    }

    public static boolean c(WeeklyPattern weeklyPattern, WeeklyPattern weeklyPattern2) {
        return atyq.b(weeklyPattern.a(), weeklyPattern2.a());
    }

    @Override // com.google.android.gms.reminders.model.WeeklyPattern
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WeeklyPattern)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return c(this, (WeeklyPattern) obj);
    }

    public final int hashCode() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czou.a(this, parcel);
    }

    public WeeklyPatternEntity(WeeklyPattern weeklyPattern) {
        List a = weeklyPattern.a();
        this.a = a == null ? null : new ArrayList(a);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
