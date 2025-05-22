package com.google.android.gms.pay;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvkx;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class CreateOrUpdateUserCreatedPassIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvkx();
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
    public boolean l;
    public UserCreatedPassVerticalMetadata m;

    private CreateOrUpdateUserCreatedPassIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateOrUpdateUserCreatedPassIntentArgs) {
            CreateOrUpdateUserCreatedPassIntentArgs createOrUpdateUserCreatedPassIntentArgs = (CreateOrUpdateUserCreatedPassIntentArgs) obj;
            if (atyq.b(this.a, createOrUpdateUserCreatedPassIntentArgs.a) && atyq.b(this.b, createOrUpdateUserCreatedPassIntentArgs.b) && atyq.b(this.c, createOrUpdateUserCreatedPassIntentArgs.c) && atyq.b(Integer.valueOf(this.d), Integer.valueOf(createOrUpdateUserCreatedPassIntentArgs.d)) && Arrays.equals(this.e, createOrUpdateUserCreatedPassIntentArgs.e) && atyq.b(this.f, createOrUpdateUserCreatedPassIntentArgs.f) && atyq.b(this.g, createOrUpdateUserCreatedPassIntentArgs.g) && atyq.b(Boolean.valueOf(this.h), Boolean.valueOf(createOrUpdateUserCreatedPassIntentArgs.h)) && Arrays.equals(this.i, createOrUpdateUserCreatedPassIntentArgs.i) && atyq.b(Boolean.valueOf(this.j), Boolean.valueOf(createOrUpdateUserCreatedPassIntentArgs.j)) && atyq.b(Integer.valueOf(this.k), Integer.valueOf(createOrUpdateUserCreatedPassIntentArgs.k)) && atyq.b(Boolean.valueOf(this.l), Boolean.valueOf(createOrUpdateUserCreatedPassIntentArgs.l)) && atyq.b(this.m, createOrUpdateUserCreatedPassIntentArgs.m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d), Integer.valueOf(Arrays.hashCode(this.e)), this.f, this.g, Boolean.valueOf(this.h), Integer.valueOf(Arrays.hashCode(this.i)), Boolean.valueOf(this.j), Integer.valueOf(this.k), Boolean.valueOf(this.l), this.m});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.o(parcel, 4, this.d);
        atzr.J(parcel, 5, this.e, i);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.e(parcel, 8, this.h);
        atzr.J(parcel, 9, this.i, i);
        atzr.e(parcel, 10, this.j);
        atzr.o(parcel, 11, this.k);
        atzr.e(parcel, 12, this.l);
        atzr.t(parcel, 13, this.m, i, false);
        atzr.c(parcel, a);
    }

    public CreateOrUpdateUserCreatedPassIntentArgs(ProtoSafeParcelable protoSafeParcelable, ProtoSafeParcelable protoSafeParcelable2, ProtoSafeParcelable protoSafeParcelable3, int i, Uri[] uriArr, ProtoSafeParcelable protoSafeParcelable4, ProtoSafeParcelable protoSafeParcelable5, boolean z, UserCreatedPassAttachmentMetadata[] userCreatedPassAttachmentMetadataArr, boolean z2, int i2, boolean z3, UserCreatedPassVerticalMetadata userCreatedPassVerticalMetadata) {
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
        this.l = z3;
        this.m = userCreatedPassVerticalMetadata;
    }
}
