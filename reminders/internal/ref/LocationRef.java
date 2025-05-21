package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.Address;
import com.google.android.gms.reminders.model.FeatureIdProto;
import com.google.android.gms.reminders.model.Location;
import com.google.android.gms.reminders.model.LocationEntity;
import defpackage.cxeb;
import defpackage.cxel;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class LocationRef extends cxeb implements Location {
    private boolean f;
    private FeatureIdProtoRef g;
    private boolean h;
    private AddressRef i;

    public LocationRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
        this.f = false;
        this.h = false;
    }

    @Override // com.google.android.gms.reminders.model.Location
    public final Address a() {
        if (!this.h) {
            this.h = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (AddressRef.j(dataHolder, i, i2, str.concat("address_"))) {
                this.i = null;
            } else {
                this.i = new AddressRef(dataHolder, this.b, str.concat("address_"));
            }
        }
        return this.i;
    }

    @Override // com.google.android.gms.reminders.model.Location
    public final FeatureIdProto c() {
        if (!this.f) {
            this.f = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (FeatureIdProtoRef.d(dataHolder, i, i2, str.concat("location_"))) {
                this.g = null;
            } else {
                this.g = new FeatureIdProtoRef(dataHolder, this.b, str.concat("location_"));
            }
        }
        return this.g;
    }

    @Override // com.google.android.gms.reminders.model.Location
    public final Double d() {
        return m(p("lat"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.reminders.model.Location
    public final Double e() {
        return m(p("lng"));
    }

    @Override // defpackage.arnw
    public final boolean equals(Object obj) {
        if (!(obj instanceof Location)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return LocationEntity.k(this, (Location) obj);
    }

    @Override // com.google.android.gms.reminders.model.Location
    public final Integer f() {
        return n(p("location_type"));
    }

    @Override // com.google.android.gms.reminders.model.Location
    public final Integer g() {
        return n(p("radius_meters"));
    }

    @Override // com.google.android.gms.reminders.model.Location
    public final String h() {
        return r(p("display_address"));
    }

    @Override // defpackage.arnw
    public final int hashCode() {
        return LocationEntity.b(this);
    }

    @Override // com.google.android.gms.reminders.model.Location
    public final String i() {
        return r(p("location_alias_id"));
    }

    @Override // com.google.android.gms.reminders.model.Location
    public final String j() {
        return r(p("name"));
    }

    @Override // defpackage.arnw, defpackage.arod
    public final /* synthetic */ Object l() {
        return new LocationEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxel.a(new LocationEntity(this), parcel, i);
    }
}
