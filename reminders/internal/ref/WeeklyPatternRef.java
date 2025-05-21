package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.WeeklyPattern;
import com.google.android.gms.reminders.model.WeeklyPatternEntity;
import defpackage.cxeb;
import defpackage.cxey;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class WeeklyPatternRef extends cxeb implements WeeklyPattern {
    public WeeklyPatternRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    public static boolean c(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.f(G(str, "weekly_pattern_weekday"), i, i2);
    }

    @Override // com.google.android.gms.reminders.model.WeeklyPattern
    public final List a() {
        return H(p("weekly_pattern_weekday"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.arnw
    public final boolean equals(Object obj) {
        if (!(obj instanceof WeeklyPattern)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return WeeklyPatternEntity.c(this, (WeeklyPattern) obj);
    }

    @Override // defpackage.arnw
    public final int hashCode() {
        return WeeklyPatternEntity.b(this);
    }

    @Override // defpackage.arnw, defpackage.arod
    public final /* synthetic */ Object l() {
        return new WeeklyPatternEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxey.a(new WeeklyPatternEntity(this), parcel);
    }
}
