package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.cxem;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class LocationGroupEntity extends AbstractSafeParcelable implements LocationGroup {
    public static final Parcelable.Creator CREATOR = new cxem();
    public final String a;
    public final Integer b;
    public final ChainInfoEntity c;
    public final CategoryInfoEntity d;

    public LocationGroupEntity(String str, Integer num, ChainInfoEntity chainInfoEntity, CategoryInfoEntity categoryInfoEntity) {
        this.a = str;
        this.b = num;
        this.c = chainInfoEntity;
        this.d = categoryInfoEntity;
    }

    public static int b(LocationGroup locationGroup) {
        return Arrays.hashCode(new Object[]{locationGroup.e(), locationGroup.d(), locationGroup.c(), locationGroup.a()});
    }

    public static boolean f(LocationGroup locationGroup, LocationGroup locationGroup2) {
        return arwb.b(locationGroup.e(), locationGroup2.e()) && arwb.b(locationGroup.d(), locationGroup2.d()) && arwb.b(locationGroup.c(), locationGroup2.c()) && arwb.b(locationGroup.a(), locationGroup2.a());
    }

    @Override // com.google.android.gms.reminders.model.LocationGroup
    public final CategoryInfo a() {
        return this.d;
    }

    @Override // com.google.android.gms.reminders.model.LocationGroup
    public final ChainInfo c() {
        return this.c;
    }

    @Override // com.google.android.gms.reminders.model.LocationGroup
    public final Integer d() {
        return this.b;
    }

    @Override // com.google.android.gms.reminders.model.LocationGroup
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationGroup)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return f(this, (LocationGroup) obj);
    }

    public final int hashCode() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxem.a(this, parcel, i);
    }

    public LocationGroupEntity(LocationGroup locationGroup) {
        String e = locationGroup.e();
        Integer d = locationGroup.d();
        ChainInfo c = locationGroup.c();
        CategoryInfo a = locationGroup.a();
        this.a = e;
        this.b = d;
        this.c = c == null ? null : new ChainInfoEntity(c);
        this.d = a != null ? new CategoryInfoEntity(a) : null;
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
