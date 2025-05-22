package com.google.android.gms.droidguard;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aswd;
import defpackage.atzr;
import defpackage.azvg;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DroidGuardResultsRequest extends AbstractSafeParcelable {
    public final Bundle a;
    private static final int b = (int) TimeUnit.SECONDS.toMillis(60);
    public static final Parcelable.Creator CREATOR = new azvg();

    public DroidGuardResultsRequest() {
        String str;
        this.a = new Bundle();
        b(aswd.b);
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
        int a = atzr.a(parcel);
        atzr.g(parcel, 2, bundle, false);
        atzr.c(parcel, a);
    }

    public DroidGuardResultsRequest(Bundle bundle) {
        new Bundle();
        this.a = bundle;
    }
}
