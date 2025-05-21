package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.cxel;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class LocationEntity extends AbstractSafeParcelable implements Location {
    public static final Parcelable.Creator CREATOR = new cxel();
    public final Double a;
    public final Double b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final FeatureIdProtoEntity f;
    public final String g;
    public final AddressEntity h;
    public final String i;

    public LocationEntity(Double d, Double d2, String str, Integer num, Integer num2, FeatureIdProtoEntity featureIdProtoEntity, String str2, AddressEntity addressEntity, String str3) {
        this.a = d;
        this.b = d2;
        this.c = str;
        this.d = num;
        this.e = num2;
        this.f = featureIdProtoEntity;
        this.g = str2;
        this.h = addressEntity;
        this.i = str3;
    }

    public static int b(Location location) {
        return Arrays.hashCode(new Object[]{location.d(), location.e(), location.j(), location.g(), location.f(), location.c(), location.h(), location.a(), location.i()});
    }

    public static boolean k(Location location, Location location2) {
        return arwb.b(location.d(), location2.d()) && arwb.b(location.e(), location2.e()) && arwb.b(location.j(), location2.j()) && arwb.b(location.g(), location2.g()) && arwb.b(location.f(), location2.f()) && arwb.b(location.c(), location2.c()) && arwb.b(location.h(), location2.h()) && arwb.b(location.a(), location2.a()) && arwb.b(location.i(), location2.i());
    }

    @Override // com.google.android.gms.reminders.model.Location
    public final Address a() {
        return this.h;
    }

    @Override // com.google.android.gms.reminders.model.Location
    public final FeatureIdProto c() {
        return this.f;
    }

    @Override // com.google.android.gms.reminders.model.Location
    public final Double d() {
        return this.a;
    }

    @Override // com.google.android.gms.reminders.model.Location
    public final Double e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Location)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return k(this, (Location) obj);
    }

    @Override // com.google.android.gms.reminders.model.Location
    public final Integer f() {
        return this.e;
    }

    @Override // com.google.android.gms.reminders.model.Location
    public final Integer g() {
        return this.d;
    }

    @Override // com.google.android.gms.reminders.model.Location
    public final String h() {
        return this.g;
    }

    public final int hashCode() {
        return b(this);
    }

    @Override // com.google.android.gms.reminders.model.Location
    public final String i() {
        return this.i;
    }

    @Override // com.google.android.gms.reminders.model.Location
    public final String j() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxel.a(this, parcel, i);
    }

    public LocationEntity(Location location) {
        Double d = location.d();
        Double e = location.e();
        String j = location.j();
        Integer g = location.g();
        Integer f = location.f();
        FeatureIdProto c = location.c();
        String h = location.h();
        Address a = location.a();
        String i = location.i();
        this.a = d;
        this.b = e;
        this.c = j;
        this.d = g;
        this.e = f;
        this.g = h;
        this.i = i;
        this.f = c == null ? null : new FeatureIdProtoEntity(c);
        this.h = a != null ? new AddressEntity(a) : null;
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
