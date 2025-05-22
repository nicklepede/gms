package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.Address;
import com.google.android.gms.reminders.model.AddressEntity;
import defpackage.cznx;
import defpackage.czny;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class AddressRef extends cznx implements Address {
    public AddressRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    public static boolean j(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.f(G(str, "country"), i, i2) && dataHolder.f(G(str, "locality"), i, i2) && dataHolder.f(G(str, "region"), i, i2) && dataHolder.f(G(str, "street_address"), i, i2) && dataHolder.f(G(str, "street_number"), i, i2) && dataHolder.f(G(str, "street_name"), i, i2) && dataHolder.f(G(str, "postal_code"), i, i2) && dataHolder.f(G(str, "name"), i, i2);
    }

    @Override // com.google.android.gms.reminders.model.Address
    public final String a() {
        return r(p("country"));
    }

    @Override // com.google.android.gms.reminders.model.Address
    public final String c() {
        return r(p("locality"));
    }

    @Override // com.google.android.gms.reminders.model.Address
    public final String d() {
        return r(p("name"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.reminders.model.Address
    public final String e() {
        return r(p("postal_code"));
    }

    @Override // defpackage.atql
    public final boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AddressEntity.j(this, (Address) obj);
    }

    @Override // com.google.android.gms.reminders.model.Address
    public final String f() {
        return r(p("region"));
    }

    @Override // com.google.android.gms.reminders.model.Address
    public final String g() {
        return r(p("street_address"));
    }

    @Override // com.google.android.gms.reminders.model.Address
    public final String h() {
        return r(p("street_name"));
    }

    @Override // defpackage.atql
    public final int hashCode() {
        return AddressEntity.b(this);
    }

    @Override // com.google.android.gms.reminders.model.Address
    public final String i() {
        return r(p("street_number"));
    }

    @Override // defpackage.atql, defpackage.atqs
    public final /* synthetic */ Object l() {
        return new AddressEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czny.a(new AddressEntity(this), parcel);
    }
}
