package com.google.android.gms.pay;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctca;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class EnterUserCreatedPassIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctca();
    public ProtoSafeParcelable a;
    public ProtoSafeParcelable b;
    public ProtoSafeParcelable c;
    public int d;
    public Uri[] e;
    public ProtoSafeParcelable f;

    private EnterUserCreatedPassIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EnterUserCreatedPassIntentArgs) {
            EnterUserCreatedPassIntentArgs enterUserCreatedPassIntentArgs = (EnterUserCreatedPassIntentArgs) obj;
            if (arwb.b(this.a, enterUserCreatedPassIntentArgs.a) && arwb.b(this.b, enterUserCreatedPassIntentArgs.b) && arwb.b(this.c, enterUserCreatedPassIntentArgs.c) && arwb.b(Integer.valueOf(this.d), Integer.valueOf(enterUserCreatedPassIntentArgs.d)) && Arrays.equals(this.e, enterUserCreatedPassIntentArgs.e) && arwb.b(this.f, enterUserCreatedPassIntentArgs.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d), Integer.valueOf(Arrays.hashCode(this.e)), this.f});
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
        arxc.c(parcel, a);
    }

    public EnterUserCreatedPassIntentArgs(ProtoSafeParcelable protoSafeParcelable, ProtoSafeParcelable protoSafeParcelable2, ProtoSafeParcelable protoSafeParcelable3, int i, Uri[] uriArr, ProtoSafeParcelable protoSafeParcelable4) {
        this.a = protoSafeParcelable;
        this.b = protoSafeParcelable2;
        this.c = protoSafeParcelable3;
        this.d = i;
        this.e = uriArr;
        this.f = protoSafeParcelable4;
    }
}
