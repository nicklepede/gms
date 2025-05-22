package com.google.android.gms.autofill.datasource.chromesync.wallet;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.autofill.data.DataIntent$ResultTransformer;
import com.google.android.gms.autofill.data.PaymentCard;
import defpackage.aftw;
import defpackage.aftz;
import defpackage.afub;
import defpackage.afuc;
import defpackage.afud;
import defpackage.agbf;
import defpackage.auid;
import defpackage.ausn;
import defpackage.ejwc;
import defpackage.ekvi;
import defpackage.eluo;
import defpackage.fddl;
import defpackage.fddm;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgti;
import j$.time.YearMonth;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class PurchaseManagerResultTransformer implements DataIntent$ResultTransformer {
    final String b;
    final YearMonth c;
    final int d;
    final aftw e;
    final ekvi f;
    final ekvi g;
    final int h;
    public static final ausn a = ausn.b("PurchaseManagerResultTransformer", auid.AUTOFILL);
    public static final Parcelable.Creator CREATOR = new agbf();

    public PurchaseManagerResultTransformer(String str, YearMonth yearMonth, aftw aftwVar, int i, int i2, ekvi ekviVar, ekvi ekviVar2) {
        this.b = str;
        this.c = yearMonth;
        this.e = aftwVar;
        this.d = i;
        this.h = i2;
        this.f = ekviVar;
        this.g = ekviVar2;
    }

    private static YearMonth b(Intent intent) {
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.firstparty.EXPIRATION_DATE");
            if (byteArrayExtra == null) {
                return null;
            }
            fgri y = fgri.y(ejwc.a, byteArrayExtra, 0, byteArrayExtra.length, fgqp.a());
            fgri.M(y);
            ejwc ejwcVar = (ejwc) y;
            if (ejwcVar != null) {
                return YearMonth.of(ejwcVar.c, ejwcVar.b);
            }
            return null;
        } catch (fgsd e) {
            ((eluo) ((eluo) a.j()).s(e)).v();
            return null;
        }
    }

    @Override // com.google.android.gms.autofill.data.DataIntent$ResultTransformer
    public final Object a(int i, Intent intent, ekvi ekviVar) {
        YearMonth b;
        YearMonth yearMonth;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        YearMonth yearMonth2;
        aftz aftzVar = null;
        if (i != -1) {
            return null;
        }
        String stringExtra = intent.getStringExtra("com.google.android.gms.wallet.firstparty.REAL_PAN");
        aftz aftzVar2 = !TextUtils.isEmpty(stringExtra) ? new aftz(stringExtra) : null;
        if (aftzVar2 == null) {
            return null;
        }
        String stringExtra2 = intent.getStringExtra("com.google.android.gms.wallet.cvnFromServer");
        if (TextUtils.isEmpty(stringExtra2)) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.SECURE_DATA_RESULT");
            if (byteArrayExtra != null) {
                try {
                    fddm fddmVar = fddm.a;
                    int length = byteArrayExtra.length;
                    fgqp fgqpVar = fgqp.a;
                    fgti fgtiVar = fgti.a;
                    fgri y = fgri.y(fddmVar, byteArrayExtra, 0, length, fgqp.a);
                    fgri.M(y);
                    Iterator it = ((fddm) y).b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        fddl fddlVar = (fddl) it.next();
                        if (fddlVar.c == 1) {
                            String str5 = fddlVar.d;
                            if (!TextUtils.isEmpty(str5)) {
                                aftzVar = new aftz(str5);
                                break;
                            }
                        }
                    }
                } catch (fgsd e) {
                    ((eluo) ((eluo) a.j()).s(e)).v();
                }
            }
        } else {
            aftzVar = new aftz(stringExtra2);
        }
        aftz aftzVar3 = aftzVar;
        int i3 = this.h;
        if (i3 == 2) {
            b = b(intent);
        } else {
            b = b(intent);
            if (b == null) {
                b = this.c;
            }
        }
        PaymentCard paymentCard = new PaymentCard(aftzVar2, aftzVar3, this.b, b, this.e, this.d);
        if (i3 == 2) {
            ekvi ekviVar2 = this.f;
            if (ekviVar2.h() && ekviVar.h()) {
                ekvi ekviVar3 = this.g;
                if (ekviVar3.h() && (yearMonth = this.c) != null) {
                    afud afudVar = (afud) ekviVar.c();
                    String str6 = (String) ekviVar2.c();
                    String str7 = (String) ekviVar3.c();
                    aftz aftzVar4 = paymentCard.a;
                    aftz aftzVar5 = paymentCard.b;
                    String str8 = paymentCard.c;
                    afub afubVar = new afub();
                    afubVar.d = "";
                    afubVar.c("");
                    afubVar.i = 1;
                    afubVar.a("");
                    afubVar.f = "";
                    afubVar.b(0);
                    afubVar.c(aftzVar4.a);
                    afubVar.a(aftzVar5 != null ? aftzVar5.a : "");
                    if (str8 == null) {
                        str8 = "";
                    }
                    afubVar.d = str8;
                    afubVar.c = paymentCard.d;
                    afubVar.i = 2;
                    afubVar.b(paymentCard.f);
                    afubVar.g = yearMonth;
                    afubVar.f = str7;
                    if (afubVar.h != 1 || (str = afubVar.a) == null || (str2 = afubVar.b) == null || (str3 = afubVar.d) == null || (i2 = afubVar.i) == 0 || (str4 = afubVar.f) == null || (yearMonth2 = afubVar.g) == null) {
                        StringBuilder sb = new StringBuilder();
                        if (afubVar.a == null) {
                            sb.append(" cardNumber");
                        }
                        if (afubVar.b == null) {
                            sb.append(" CVN");
                        }
                        if (afubVar.d == null) {
                            sb.append(" cardholderName");
                        }
                        if (afubVar.i == 0) {
                            sb.append(" cardType");
                        }
                        if (afubVar.h == 0) {
                            sb.append(" cardNetworkType");
                        }
                        if (afubVar.f == null) {
                            sb.append(" lastFourOfMaskedCard");
                        }
                        if (afubVar.g == null) {
                            sb.append(" expirationDateOfMaskedCard");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                    afudVar.a.h(str6, new afuc(str, str2, afubVar.c, str3, i2, afubVar.e, str4, yearMonth2));
                }
            }
        }
        return paymentCard;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeSerializable(this.c);
        parcel.writeByteArray(this.e.r());
        parcel.writeInt(this.d);
        int i2 = this.h;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i2);
        parcel.writeString((String) this.f.e(""));
        parcel.writeString((String) this.g.e(""));
    }
}
