package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.eitj;
import defpackage.zdo;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class VerifyWithGoogleRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new zdo();
    public final eitj a;
    public final String b;
    public final boolean c;
    public final String d;

    public VerifyWithGoogleRequest(List list, String str, boolean z, String str2) {
        arwm.c((list == null || list.isEmpty()) ? false : true, "requestedScopes cannot be null or empty");
        if (z) {
            arwm.c(str != null, "If offline access is requested, server client id must be provided.");
        } else {
            arwm.c(str == null, "If offline access is not requested, server client id must not be provided.");
        }
        this.a = eitj.i(list);
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VerifyWithGoogleRequest)) {
            return false;
        }
        VerifyWithGoogleRequest verifyWithGoogleRequest = (VerifyWithGoogleRequest) obj;
        eitj eitjVar = this.a;
        int size = eitjVar.size();
        eitj eitjVar2 = verifyWithGoogleRequest.a;
        return size == eitjVar2.size() && eitjVar.containsAll(eitjVar2) && this.c == verifyWithGoogleRequest.c && arwb.b(this.b, verifyWithGoogleRequest.b) && arwb.b(this.d, verifyWithGoogleRequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        eitj eitjVar = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, eitjVar, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.e(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }
}
