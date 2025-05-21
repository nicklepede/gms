package com.google.android.gms.pay;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctbs;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class CreateOrUpdateUserCreatedPassIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctbs();
    public ProtoSafeParcelable a;
    public ProtoSafeParcelable b;
    public ProtoSafeParcelable c;
    public int d;
    public Uri[] e;
    public ProtoSafeParcelable f;
    public ProtoSafeParcelable g;
    public boolean h;
    public UserCreatedPassAttachmentMetadata[] i;
    public boolean j;
    public int k;

    private CreateOrUpdateUserCreatedPassIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateOrUpdateUserCreatedPassIntentArgs) {
            CreateOrUpdateUserCreatedPassIntentArgs createOrUpdateUserCreatedPassIntentArgs = (CreateOrUpdateUserCreatedPassIntentArgs) obj;
            if (arwb.b(this.a, createOrUpdateUserCreatedPassIntentArgs.a) && arwb.b(this.b, createOrUpdateUserCreatedPassIntentArgs.b) && arwb.b(this.c, createOrUpdateUserCreatedPassIntentArgs.c) && arwb.b(Integer.valueOf(this.d), Integer.valueOf(createOrUpdateUserCreatedPassIntentArgs.d)) && Arrays.equals(this.e, createOrUpdateUserCreatedPassIntentArgs.e) && arwb.b(this.f, createOrUpdateUserCreatedPassIntentArgs.f) && arwb.b(this.g, createOrUpdateUserCreatedPassIntentArgs.g) && arwb.b(Boolean.valueOf(this.h), Boolean.valueOf(createOrUpdateUserCreatedPassIntentArgs.h)) && Arrays.equals(this.i, createOrUpdateUserCreatedPassIntentArgs.i) && arwb.b(Boolean.valueOf(this.j), Boolean.valueOf(createOrUpdateUserCreatedPassIntentArgs.j)) && arwb.b(Integer.valueOf(this.k), Integer.valueOf(createOrUpdateUserCreatedPassIntentArgs.k))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d), Integer.valueOf(Arrays.hashCode(this.e)), this.f, this.g, Boolean.valueOf(this.h), Integer.valueOf(Arrays.hashCode(this.i)), Boolean.valueOf(this.j), Integer.valueOf(this.k)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.o(parcel, 4, this.d);
        arxc.J(parcel, 5, this.e, i);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.e(parcel, 8, this.h);
        arxc.J(parcel, 9, this.i, i);
        arxc.e(parcel, 10, this.j);
        arxc.o(parcel, 11, this.k);
        arxc.c(parcel, a);
    }

    public CreateOrUpdateUserCreatedPassIntentArgs(ProtoSafeParcelable protoSafeParcelable, ProtoSafeParcelable protoSafeParcelable2, ProtoSafeParcelable protoSafeParcelable3, int i, Uri[] uriArr, ProtoSafeParcelable protoSafeParcelable4, ProtoSafeParcelable protoSafeParcelable5, boolean z, UserCreatedPassAttachmentMetadata[] userCreatedPassAttachmentMetadataArr, boolean z2, int i2) {
        this.a = protoSafeParcelable;
        this.b = protoSafeParcelable2;
        this.c = protoSafeParcelable3;
        this.d = i;
        this.e = uriArr;
        this.f = protoSafeParcelable4;
        this.g = protoSafeParcelable5;
        this.h = z;
        this.i = userCreatedPassAttachmentMetadataArr;
        this.j = z2;
        this.k = i2;
    }
}
