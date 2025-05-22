package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.czny;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class AddressEntity extends AbstractSafeParcelable implements Address {
    public static final Parcelable.Creator CREATOR = new czny();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public AddressEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public static int b(Address address) {
        return Arrays.hashCode(new Object[]{address.a(), address.c(), address.f(), address.g(), address.i(), address.h(), address.e(), address.d()});
    }

    public static boolean j(Address address, Address address2) {
        return atyq.b(address.a(), address2.a()) && atyq.b(address.c(), address2.c()) && atyq.b(address.f(), address2.f()) && atyq.b(address.g(), address2.g()) && atyq.b(address.i(), address2.i()) && atyq.b(address.h(), address2.h()) && atyq.b(address.e(), address2.e()) && atyq.b(address.d(), address2.d());
    }

    @Override // com.google.android.gms.reminders.model.Address
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.reminders.model.Address
    public final String c() {
        return this.b;
    }

    @Override // com.google.android.gms.reminders.model.Address
    public final String d() {
        return this.h;
    }

    @Override // com.google.android.gms.reminders.model.Address
    public final String e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return j(this, (Address) obj);
    }

    @Override // com.google.android.gms.reminders.model.Address
    public final String f() {
        return this.c;
    }

    @Override // com.google.android.gms.reminders.model.Address
    public final String g() {
        return this.d;
    }

    @Override // com.google.android.gms.reminders.model.Address
    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        return b(this);
    }

    @Override // com.google.android.gms.reminders.model.Address
    public final String i() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czny.a(this, parcel);
    }

    public AddressEntity(Address address) {
        this(address.a(), address.c(), address.f(), address.g(), address.i(), address.h(), address.e(), address.d());
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
