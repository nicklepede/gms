package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cwpt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PhoneEntity extends AbstractSafeParcelable implements Phone {
    public static final Parcelable.Creator CREATOR = new cwpt();
    public final PersonFieldMetadataEntity a;
    public final String b;
    public final String c;

    public PhoneEntity(PersonFieldMetadata personFieldMetadata, String str, String str2) {
        this.b = str;
        this.c = str2;
        this.a = (PersonFieldMetadataEntity) personFieldMetadata;
    }

    @Override // com.google.android.gms.people.protomodel.Phone
    public final PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Phone
    public final String b() {
        return this.c;
    }

    @Override // com.google.android.gms.people.protomodel.Phone
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Phone)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Phone phone = (Phone) obj;
        return atyq.b(a(), phone.a()) && atyq.b(c(), phone.c()) && atyq.b(b(), phone.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), c(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PersonFieldMetadataEntity personFieldMetadataEntity = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, personFieldMetadataEntity, i, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.c(parcel, a);
    }

    public PhoneEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str, String str2) {
        this.a = personFieldMetadataEntity;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
