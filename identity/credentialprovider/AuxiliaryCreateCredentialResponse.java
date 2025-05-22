package com.google.android.gms.identity.credentialprovider;

import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bopd;
import defpackage.fxsr;
import defpackage.fxxm;
import defpackage.jaz;
import defpackage.jba;
import defpackage.jcp;
import defpackage.jdi;
import defpackage.jdj;
import defpackage.jeb;
import defpackage.jec;
import j$.time.Instant;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AuxiliaryCreateCredentialResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bopd();
    public final String a;
    public final jcp b;
    public final jba c;

    public AuxiliaryCreateCredentialResponse(String str, jcp jcpVar, jba jbaVar) {
        atzb.c((jcpVar == null) ^ (jbaVar == null), "Exactly one of response or exception can be set");
        atzb.c((str == null && jbaVar == null) ? false : true, "fullyQualifiedServiceName can only be null when exception is not null");
        this.a = str;
        this.b = jcpVar;
        this.c = jbaVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuxiliaryCreateCredentialResponse) {
            AuxiliaryCreateCredentialResponse auxiliaryCreateCredentialResponse = (AuxiliaryCreateCredentialResponse) obj;
            if (atyq.b(this.a, auxiliaryCreateCredentialResponse.a) && atyq.b(this.c, auxiliaryCreateCredentialResponse.c) && atyq.b(this.b, auxiliaryCreateCredentialResponse.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        Instant instant;
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        jcp jcpVar = this.b;
        if (jcpVar == null) {
            bundle = null;
        } else {
            bundle = new Bundle();
            List list = jcpVar.a;
            fxxm.f(list, "<this>");
            bundle.putInt("androidx.credentials.provider.extra.CREATE_ENTRY_SIZE", list.size());
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    fxsr.k();
                }
                jdj jdjVar = (jdj) obj;
                bundle.putCharSequence(a.j(i2, "androidx.credentials.provider.extra.ACCOUNT_NAME_"), jdjVar.a);
                bundle.putParcelable(a.j(i2, "androidx.credentials.provider.extra.PENDING_INTENT_"), jdjVar.b);
                Icon icon = jdjVar.c;
                if (icon != null) {
                    bundle.putParcelable(a.j(i2, "androidx.credentials.provider.extra.ICON_"), icon);
                }
                CharSequence charSequence = jdjVar.d;
                if (charSequence != null) {
                    bundle.putCharSequence(a.j(i2, "androidx.credentials.provider.extra.DESCRIPTION_"), charSequence);
                }
                if (Build.VERSION.SDK_INT >= 26 && (instant = jdjVar.e) != null) {
                    bundle.putSerializable(a.j(i2, "androidx.credentials.provider.extra.LAST_USED_TIME_"), instant);
                }
                Bundle a2 = jdi.a(jdjVar.f);
                if (a2 != null) {
                    bundle.putBundle(a.j(i2, "androidx.credentials.provider.extra.CREDENTIAL_COUNT_INFO_"), a2);
                }
                bundle.putBoolean(a.j(i2, "androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_"), jdjVar.g);
                i2 = i3;
            }
            jec jecVar = jcpVar.b;
            if (jecVar != null) {
                jeb.a(jecVar, bundle);
            }
        }
        atzr.g(parcel, 3, bundle, false);
        jba jbaVar = this.c;
        atzr.g(parcel, 4, jbaVar != null ? jaz.a(jbaVar) : null, false);
        atzr.c(parcel, a);
    }
}
