package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aaxt;
import defpackage.abau;
import defpackage.arwm;
import defpackage.arxc;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountNameCheckResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aaxt();
    String a;
    List b;
    String c;
    CaptchaChallenge d;

    public AccountNameCheckResponse(String str, List list, String str2, CaptchaChallenge captchaChallenge) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = captchaChallenge;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, this.a, false);
        arxc.x(parcel, 3, this.b, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.t(parcel, 5, this.d, i, false);
        arxc.c(parcel, a);
    }

    public AccountNameCheckResponse(abau abauVar) {
        this(abauVar, (String) null, (CaptchaChallenge) null, Collections.EMPTY_LIST);
    }

    public AccountNameCheckResponse(abau abauVar, String str, CaptchaChallenge captchaChallenge, List list) {
        arwm.s(abauVar);
        this.a = abauVar.ak;
        this.c = str;
        this.d = captchaChallenge;
        this.b = DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
