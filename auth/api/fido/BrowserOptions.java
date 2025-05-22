package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.ChromeOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aazq;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.fgpr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class BrowserOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aazq();
    public final String a;
    public final fgpr b;
    public final ChromeOptions c;

    public BrowserOptions(String str, fgpr fgprVar, ChromeOptions chromeOptions) {
        atzb.s(str);
        this.a = str;
        this.b = fgprVar;
        this.c = chromeOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserOptions)) {
            return false;
        }
        BrowserOptions browserOptions = (BrowserOptions) obj;
        return atyq.b(this.a, browserOptions.a) && atyq.b(this.b, browserOptions.b) && atyq.b(this.c, browserOptions.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        fgpr fgprVar = this.b;
        atzr.i(parcel, 3, fgprVar == null ? null : fgprVar.M(), false);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.c(parcel, a);
    }
}
