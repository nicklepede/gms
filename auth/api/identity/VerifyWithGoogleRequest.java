package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abdj;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.elgo;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class VerifyWithGoogleRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new abdj();
    public final elgo a;
    public final String b;
    public final boolean c;
    public final String d;

    public VerifyWithGoogleRequest(List list, String str, boolean z, String str2) {
        atzb.c((list == null || list.isEmpty()) ? false : true, "requestedScopes cannot be null or empty");
        if (z) {
            atzb.c(str != null, "If offline access is requested, server client id must be provided.");
        } else {
            atzb.c(str == null, "If offline access is not requested, server client id must not be provided.");
        }
        this.a = elgo.i(list);
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VerifyWithGoogleRequest)) {
            return false;
        }
        VerifyWithGoogleRequest verifyWithGoogleRequest = (VerifyWithGoogleRequest) obj;
        elgo elgoVar = this.a;
        int size = elgoVar.size();
        elgo elgoVar2 = verifyWithGoogleRequest.a;
        return size == elgoVar2.size() && elgoVar.containsAll(elgoVar2) && this.c == verifyWithGoogleRequest.c && atyq.b(this.b, verifyWithGoogleRequest.b) && atyq.b(this.d, verifyWithGoogleRequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        elgo elgoVar = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, elgoVar, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.e(parcel, 3, this.c);
        atzr.v(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }
}
