package com.google.android.gms.droidguard;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqto;
import defpackage.arxc;
import defpackage.axrg;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DroidGuardResultsRequest extends AbstractSafeParcelable {
    public final Bundle a;
    private static final int b = (int) TimeUnit.SECONDS.toMillis(60);
    public static final Parcelable.Creator CREATOR = new axrg();

    public DroidGuardResultsRequest() {
        String str;
        this.a = new Bundle();
        b(aqto.b);
        try {
            str = System.getProperty("os.arch");
        } catch (Exception unused) {
            str = "?";
        }
        this.a.putString("appArchitecture", str);
    }

    public final int a() {
        return this.a.getInt("timeoutMs", b);
    }

    public final void b(int i) {
        this.a.putInt("clientVersion", i);
    }

    public final void c(int i) {
        this.a.putInt("openHandles", i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.a;
        int a = arxc.a(parcel);
        arxc.g(parcel, 2, bundle, false);
        arxc.c(parcel, a);
    }

    public DroidGuardResultsRequest(Bundle bundle) {
        new Bundle();
        this.a = bundle;
    }
}
