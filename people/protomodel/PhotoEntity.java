package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cugn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PhotoEntity extends AbstractSafeParcelable implements Photo {
    public static final Parcelable.Creator CREATOR = new cugn();
    public final PersonFieldMetadataEntity a;
    public final String b;

    public PhotoEntity(PersonFieldMetadata personFieldMetadata, String str) {
        this.b = str;
        this.a = (PersonFieldMetadataEntity) personFieldMetadata;
    }

    @Override // com.google.android.gms.people.protomodel.Photo
    public final PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Photo
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Photo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Photo photo = (Photo) obj;
        return arwb.b(a(), photo.a()) && arwb.b(b(), photo.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PersonFieldMetadataEntity personFieldMetadataEntity = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, personFieldMetadataEntity, i, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }

    public PhotoEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str) {
        this.a = personFieldMetadataEntity;
        this.b = str;
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
