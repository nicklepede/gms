package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.CategoryInfo;
import com.google.android.gms.reminders.model.ChainInfo;
import com.google.android.gms.reminders.model.LocationGroup;
import com.google.android.gms.reminders.model.LocationGroupEntity;
import defpackage.cxeb;
import defpackage.cxem;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class LocationGroupRef extends cxeb implements LocationGroup {
    private boolean f;
    private ChainInfoRef g;
    private boolean h;
    private CategoryInfoRef i;

    public LocationGroupRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
        this.f = false;
        this.h = false;
    }

    @Override // com.google.android.gms.reminders.model.LocationGroup
    public final CategoryInfo a() {
        if (!this.h) {
            this.h = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (CategoryInfoRef.e(dataHolder, i, i2, str)) {
                this.i = null;
            } else {
                this.i = new CategoryInfoRef(dataHolder, this.b, str);
            }
        }
        return this.i;
    }

    @Override // com.google.android.gms.reminders.model.LocationGroup
    public final ChainInfo c() {
        if (!this.f) {
            this.f = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (ChainInfoRef.d(dataHolder, i, i2, str)) {
                this.g = null;
            } else {
                this.g = new ChainInfoRef(dataHolder, this.b, str);
            }
        }
        return this.g;
    }

    @Override // com.google.android.gms.reminders.model.LocationGroup
    public final Integer d() {
        return n(p("location_query_type"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.reminders.model.LocationGroup
    public final String e() {
        return r(p("location_query"));
    }

    @Override // defpackage.arnw
    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationGroup)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return LocationGroupEntity.f(this, (LocationGroup) obj);
    }

    @Override // defpackage.arnw
    public final int hashCode() {
        return LocationGroupEntity.b(this);
    }

    @Override // defpackage.arnw, defpackage.arod
    public final /* synthetic */ Object l() {
        return new LocationGroupEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxem.a(new LocationGroupEntity(this), parcel, i);
    }
}
