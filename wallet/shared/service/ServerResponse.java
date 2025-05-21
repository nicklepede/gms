package com.google.android.gms.wallet.shared.service;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.arxc;
import defpackage.djdv;
import defpackage.djdw;
import defpackage.ehdn;
import defpackage.ehhp;
import defpackage.ehhr;
import defpackage.ehji;
import defpackage.ehjm;
import defpackage.ehjs;
import defpackage.ehju;
import defpackage.ehkk;
import defpackage.ehkm;
import defpackage.eicz;
import defpackage.eidg;
import defpackage.eidm;
import defpackage.eido;
import defpackage.eidt;
import defpackage.eidv;
import defpackage.eidz;
import defpackage.eiee;
import defpackage.eieg;
import defpackage.eiem;
import defpackage.eieq;
import defpackage.eiev;
import defpackage.eulo;
import defpackage.fare;
import defpackage.fari;
import defpackage.fatx;
import defpackage.faub;
import defpackage.faud;
import defpackage.fauh;
import defpackage.fauk;
import defpackage.fauo;
import defpackage.fauw;
import defpackage.favc;
import defpackage.favg;
import defpackage.favk;
import defpackage.favm;
import defpackage.favq;
import defpackage.fedk;
import defpackage.feeg;
import defpackage.feen;
import defpackage.fwac;
import defpackage.fwah;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class ServerResponse extends AbstractSafeParcelable implements ReflectedParcelable, djdv {
    int f;
    byte[] g;
    String h;
    private feeg i;
    public static final ServerResponse a = new ServerResponse(6, (feeg) null);
    public static final ServerResponse b = new ServerResponse(5, (feeg) null);
    public static final ServerResponse c = new ServerResponse(22, (feeg) null);
    public static final ServerResponse d = new ServerResponse(1, (feeg) null);
    public static final ServerResponse e = new ServerResponse(39, (feeg) null);
    public static final Parcelable.Creator CREATOR = new djdw();

    ServerResponse() {
        this.f = 1;
    }

    public static boolean e(int i) {
        if (i == 17 || i == 30 || i == 68) {
            return true;
        }
        switch (i) {
            case fwac.G /* 33 */:
            case fwac.H /* 34 */:
            case fwac.I /* 35 */:
            case fwac.J /* 36 */:
            case fwac.K /* 37 */:
            case fwac.L /* 38 */:
                return true;
            default:
                switch (i) {
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_EMAIL_SUBJECT /* 48 */:
                        return true;
                    default:
                        switch (i) {
                            case fwah.p /* 51 */:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                            case 60:
                            case 61:
                            case 62:
                            case 63:
                                return true;
                            default:
                                switch (i) {
                                    case 73:
                                    case 74:
                                    case 75:
                                    case 76:
                                    case 77:
                                    case 78:
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [feeg, java.lang.Object] */
    private final void g() {
        byte[] bArr;
        if (this.i == null) {
            int i = this.f;
            if (e(i)) {
                feen feenVar = null;
                if (i == 17) {
                    feenVar = (feen) ehdn.a.iB(7, null);
                } else if (i == 30) {
                    feenVar = (feen) eulo.a.iB(7, null);
                } else if (i != 68) {
                    switch (i) {
                        case fwac.G /* 33 */:
                            feenVar = (feen) ehjs.a.iB(7, null);
                            break;
                        case fwac.H /* 34 */:
                            feenVar = (feen) ehkm.a.iB(7, null);
                            break;
                        case fwac.I /* 35 */:
                            feenVar = (feen) ehkk.a.iB(7, null);
                            break;
                        case fwac.J /* 36 */:
                            feenVar = (feen) eieg.a.iB(7, null);
                            break;
                        case fwac.K /* 37 */:
                            feenVar = (feen) eiee.a.iB(7, null);
                            break;
                        case fwac.L /* 38 */:
                            feenVar = (feen) ehju.a.iB(7, null);
                            break;
                        default:
                            switch (i) {
                                case 41:
                                    feenVar = (feen) fauo.a.iB(7, null);
                                    break;
                                case 42:
                                    feenVar = (feen) fare.a.iB(7, null);
                                    break;
                                case 43:
                                    feenVar = (feen) fari.a.iB(7, null);
                                    break;
                                case 44:
                                    feenVar = (feen) eido.a.iB(7, null);
                                    break;
                                case 45:
                                    feenVar = (feen) eidv.a.iB(7, null);
                                    break;
                                case 46:
                                    feenVar = (feen) eidt.a.iB(7, null);
                                    break;
                                case 47:
                                    feenVar = (feen) eieq.a.iB(7, null);
                                    break;
                                case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_EMAIL_SUBJECT /* 48 */:
                                    feenVar = (feen) eiev.a.iB(7, null);
                                    break;
                                default:
                                    switch (i) {
                                        case fwah.p /* 51 */:
                                            feenVar = (feen) fauk.a.iB(7, null);
                                            break;
                                        case 52:
                                            feenVar = (feen) eidg.a.iB(7, null);
                                            break;
                                        case 53:
                                            feenVar = (feen) eicz.a.iB(7, null);
                                            break;
                                        case 54:
                                            feenVar = (feen) ehji.a.iB(7, null);
                                            break;
                                        case 55:
                                            feenVar = (feen) ehjm.a.iB(7, null);
                                            break;
                                        case 56:
                                            feenVar = (feen) faud.a.iB(7, null);
                                            break;
                                        case 57:
                                            feenVar = (feen) fauh.a.iB(7, null);
                                            break;
                                        case 58:
                                            feenVar = (feen) ehhp.a.iB(7, null);
                                            break;
                                        case 59:
                                            feenVar = (feen) ehhr.a.iB(7, null);
                                            break;
                                        case 60:
                                            feenVar = (feen) fatx.a.iB(7, null);
                                            break;
                                        case 61:
                                            feenVar = (feen) faub.a.iB(7, null);
                                            break;
                                        case 62:
                                            feenVar = (feen) favc.a.iB(7, null);
                                            break;
                                        case 63:
                                            feenVar = (feen) favg.a.iB(7, null);
                                            break;
                                        default:
                                            switch (i) {
                                                case 73:
                                                    feenVar = (feen) favq.a.iB(7, null);
                                                    break;
                                                case 74:
                                                    feenVar = (feen) favk.a.iB(7, null);
                                                    break;
                                                case 75:
                                                    feenVar = (feen) favm.a.iB(7, null);
                                                    break;
                                                case 76:
                                                    feenVar = (feen) fauw.a.iB(7, null);
                                                    break;
                                                case 77:
                                                    feenVar = (feen) eidm.a.iB(7, null);
                                                    break;
                                                case 78:
                                                    feenVar = (feen) eiem.a.iB(7, null);
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    feenVar = (feen) eidz.a.iB(7, null);
                }
                if (feenVar == null || (bArr = this.g) == null) {
                    this.f = 1;
                    Log.e("ServerResponse", "Unknown proto class type for responseType=1");
                    return;
                }
                try {
                    this.i = feenVar.j(bArr);
                } catch (fedk e2) {
                    this.f = 1;
                    Log.e("ServerResponse", "Failed to parse parcelable proto", e2);
                }
            }
        }
    }

    @Override // defpackage.djdv
    public final boolean a() {
        return this.f == 22;
    }

    public final int b() {
        g();
        return this.f;
    }

    public final feeg c() {
        g();
        return this.i;
    }

    public final boolean d() {
        g();
        return e(this.f);
    }

    public final byte[] f() {
        byte[] bArr = this.g;
        feeg feegVar = this.i;
        return feegVar != null ? feegVar.r() : bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        feeg feegVar;
        this.g = f();
        if (this.h == null && (feegVar = this.i) != null) {
            this.h = feegVar.getClass().getName();
        }
        int a2 = arxc.a(parcel);
        arxc.o(parcel, 2, this.f);
        arxc.i(parcel, 3, this.g, false);
        arxc.v(parcel, 4, this.h, false);
        arxc.c(parcel, a2);
    }

    public ServerResponse(int i, feeg feegVar) {
        this.f = i;
        this.i = feegVar;
    }

    public ServerResponse(int i, byte[] bArr) {
        this.f = i;
        this.g = bArr;
    }

    public ServerResponse(int i, byte[] bArr, String str) {
        this.f = i;
        this.g = bArr;
        this.h = str;
    }
}
