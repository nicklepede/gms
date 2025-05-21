package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.MonthlyPattern;
import com.google.android.gms.reminders.model.YearlyPattern;
import com.google.android.gms.reminders.model.YearlyPatternEntity;
import defpackage.cxeb;
import defpackage.cxez;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class YearlyPatternRef extends cxeb implements YearlyPattern {
    private boolean f;
    private MonthlyPatternRef g;

    public YearlyPatternRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
        this.f = false;
    }

    public static boolean d(DataHolder dataHolder, int i, int i2, String str) {
        return MonthlyPatternRef.e(dataHolder, i, i2, str.concat("yearly_pattern_")) && dataHolder.f(G(str, "yearly_pattern_year_month"), i, i2);
    }

    @Override // com.google.android.gms.reminders.model.YearlyPattern
    public final MonthlyPattern a() {
        if (!this.f) {
            this.f = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (MonthlyPatternRef.e(dataHolder, i, i2, str.concat("yearly_pattern_"))) {
                this.g = null;
            } else {
                this.g = new MonthlyPatternRef(dataHolder, this.b, str.concat("yearly_pattern_"));
            }
        }
        return this.g;
    }

    @Override // com.google.android.gms.reminders.model.YearlyPattern
    public final List c() {
        return H(p("yearly_pattern_year_month"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.arnw
    public final boolean equals(Object obj) {
        if (!(obj instanceof YearlyPattern)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return YearlyPatternEntity.d(this, (YearlyPattern) obj);
    }

    @Override // defpackage.arnw
    public final int hashCode() {
        return YearlyPatternEntity.b(this);
    }

    @Override // defpackage.arnw, defpackage.arod
    public final /* synthetic */ Object l() {
        return new YearlyPatternEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxez.a(new YearlyPatternEntity(this), parcel, i);
    }
}
