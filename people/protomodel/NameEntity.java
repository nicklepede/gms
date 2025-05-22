package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cwpq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class NameEntity extends AbstractSafeParcelable implements Name {
    public static final Parcelable.Creator CREATOR = new cwpq();
    public final PersonFieldMetadataEntity a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public NameEntity(PersonFieldMetadata personFieldMetadata, String str, String str2, String str3, String str4, String str5) {
        this.b = str;
        this.c = null;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.a = (PersonFieldMetadataEntity) personFieldMetadata;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String c() {
        return this.e;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String d() {
        return this.g;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Name)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Name name = (Name) obj;
        return atyq.b(a(), name.a()) && atyq.b(b(), name.b()) && atyq.b(g(), name.g()) && atyq.b(e(), name.e()) && atyq.b(c(), name.c()) && atyq.b(f(), name.f()) && atyq.b(d(), name.d());
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String f() {
        return this.f;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String g() {
        return this.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), g(), e(), c(), f(), d()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PersonFieldMetadataEntity personFieldMetadataEntity = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, personFieldMetadataEntity, i, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.g, false);
        atzr.v(parcel, 5, this.d, false);
        atzr.v(parcel, 6, this.e, false);
        atzr.v(parcel, 7, this.f, false);
        atzr.v(parcel, 17, this.c, false);
        atzr.c(parcel, a);
    }

    public NameEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = personFieldMetadataEntity;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
