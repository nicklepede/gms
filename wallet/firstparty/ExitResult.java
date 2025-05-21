package com.google.android.gms.wallet.firstparty;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.diot;
import defpackage.diou;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class ExitResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new diou();
    public int a;
    public String b;
    public int c;
    public int d;

    public ExitResult() {
        this.a = 402;
        this.b = "";
        this.c = 0;
        this.d = 0;
    }

    public static diot a() {
        return new diot(new ExitResult());
    }

    public final void b(Intent intent) {
        Bundle bundle = new Bundle();
        bundle.putInt("paymentsExitCode", this.a);
        bundle.putString("debugMessage", this.b);
        bundle.putInt("playBillingExitCode", this.c);
        bundle.putInt("apiErrorReason", this.d);
        intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_EXIT_RESULT_BUNDLE", bundle);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.c(parcel, a);
    }

    public ExitResult(int i, String str, int i2, int i3) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
    }
}
