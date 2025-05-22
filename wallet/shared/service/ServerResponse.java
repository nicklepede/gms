package com.google.android.gms.wallet.shared.service;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.atzr;
import defpackage.dlpo;
import defpackage.dlpp;
import defpackage.ejqs;
import defpackage.ejuv;
import defpackage.ejux;
import defpackage.ejwo;
import defpackage.ejws;
import defpackage.ejwy;
import defpackage.ejxa;
import defpackage.ejxq;
import defpackage.ejxs;
import defpackage.ekqf;
import defpackage.ekqm;
import defpackage.ekqs;
import defpackage.ekqu;
import defpackage.ekqz;
import defpackage.ekrb;
import defpackage.ekrf;
import defpackage.ekrk;
import defpackage.ekrm;
import defpackage.ekrs;
import defpackage.ekrw;
import defpackage.eksb;
import defpackage.exbh;
import defpackage.fdft;
import defpackage.fdfx;
import defpackage.fdim;
import defpackage.fdiq;
import defpackage.fdis;
import defpackage.fdiw;
import defpackage.fdiz;
import defpackage.fdjd;
import defpackage.fdjl;
import defpackage.fdjs;
import defpackage.fdjw;
import defpackage.fdka;
import defpackage.fdkc;
import defpackage.fdkg;
import defpackage.fgsd;
import defpackage.fgsz;
import defpackage.fgtg;
import defpackage.fywe;
import defpackage.fywj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class ServerResponse extends AbstractSafeParcelable implements ReflectedParcelable, dlpo {
    int f;
    byte[] g;
    String h;
    private fgsz i;
    public static final ServerResponse a = new ServerResponse(6, (fgsz) null);
    public static final ServerResponse b = new ServerResponse(5, (fgsz) null);
    public static final ServerResponse c = new ServerResponse(22, (fgsz) null);
    public static final ServerResponse d = new ServerResponse(1, (fgsz) null);
    public static final ServerResponse e = new ServerResponse(39, (fgsz) null);
    public static final Parcelable.Creator CREATOR = new dlpp();

    ServerResponse() {
        this.f = 1;
    }

    public static boolean e(int i) {
        if (i == 17 || i == 30 || i == 68) {
            return true;
        }
        switch (i) {
            case fywe.G /* 33 */:
            case fywe.H /* 34 */:
            case fywe.I /* 35 */:
            case fywe.J /* 36 */:
            case fywe.K /* 37 */:
            case fywe.L /* 38 */:
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
                            case fywj.p /* 51 */:
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

    /* JADX WARN: Type inference failed for: r2v3, types: [fgsz, java.lang.Object] */
    private final void g() {
        byte[] bArr;
        if (this.i == null) {
            int i = this.f;
            if (e(i)) {
                fgtg fgtgVar = null;
                if (i == 17) {
                    fgtgVar = (fgtg) ejqs.a.iQ(7, null);
                } else if (i == 30) {
                    fgtgVar = (fgtg) exbh.a.iQ(7, null);
                } else if (i != 68) {
                    switch (i) {
                        case fywe.G /* 33 */:
                            fgtgVar = (fgtg) ejwy.a.iQ(7, null);
                            break;
                        case fywe.H /* 34 */:
                            fgtgVar = (fgtg) ejxs.a.iQ(7, null);
                            break;
                        case fywe.I /* 35 */:
                            fgtgVar = (fgtg) ejxq.a.iQ(7, null);
                            break;
                        case fywe.J /* 36 */:
                            fgtgVar = (fgtg) ekrm.a.iQ(7, null);
                            break;
                        case fywe.K /* 37 */:
                            fgtgVar = (fgtg) ekrk.a.iQ(7, null);
                            break;
                        case fywe.L /* 38 */:
                            fgtgVar = (fgtg) ejxa.a.iQ(7, null);
                            break;
                        default:
                            switch (i) {
                                case 41:
                                    fgtgVar = (fgtg) fdjd.a.iQ(7, null);
                                    break;
                                case 42:
                                    fgtgVar = (fgtg) fdft.a.iQ(7, null);
                                    break;
                                case 43:
                                    fgtgVar = (fgtg) fdfx.a.iQ(7, null);
                                    break;
                                case 44:
                                    fgtgVar = (fgtg) ekqu.a.iQ(7, null);
                                    break;
                                case 45:
                                    fgtgVar = (fgtg) ekrb.a.iQ(7, null);
                                    break;
                                case 46:
                                    fgtgVar = (fgtg) ekqz.a.iQ(7, null);
                                    break;
                                case 47:
                                    fgtgVar = (fgtg) ekrw.a.iQ(7, null);
                                    break;
                                case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_EMAIL_SUBJECT /* 48 */:
                                    fgtgVar = (fgtg) eksb.a.iQ(7, null);
                                    break;
                                default:
                                    switch (i) {
                                        case fywj.p /* 51 */:
                                            fgtgVar = (fgtg) fdiz.a.iQ(7, null);
                                            break;
                                        case 52:
                                            fgtgVar = (fgtg) ekqm.a.iQ(7, null);
                                            break;
                                        case 53:
                                            fgtgVar = (fgtg) ekqf.a.iQ(7, null);
                                            break;
                                        case 54:
                                            fgtgVar = (fgtg) ejwo.a.iQ(7, null);
                                            break;
                                        case 55:
                                            fgtgVar = (fgtg) ejws.a.iQ(7, null);
                                            break;
                                        case 56:
                                            fgtgVar = (fgtg) fdis.a.iQ(7, null);
                                            break;
                                        case 57:
                                            fgtgVar = (fgtg) fdiw.a.iQ(7, null);
                                            break;
                                        case 58:
                                            fgtgVar = (fgtg) ejuv.a.iQ(7, null);
                                            break;
                                        case 59:
                                            fgtgVar = (fgtg) ejux.a.iQ(7, null);
                                            break;
                                        case 60:
                                            fgtgVar = (fgtg) fdim.a.iQ(7, null);
                                            break;
                                        case 61:
                                            fgtgVar = (fgtg) fdiq.a.iQ(7, null);
                                            break;
                                        case 62:
                                            fgtgVar = (fgtg) fdjs.a.iQ(7, null);
                                            break;
                                        case 63:
                                            fgtgVar = (fgtg) fdjw.a.iQ(7, null);
                                            break;
                                        default:
                                            switch (i) {
                                                case 73:
                                                    fgtgVar = (fgtg) fdkg.a.iQ(7, null);
                                                    break;
                                                case 74:
                                                    fgtgVar = (fgtg) fdka.a.iQ(7, null);
                                                    break;
                                                case 75:
                                                    fgtgVar = (fgtg) fdkc.a.iQ(7, null);
                                                    break;
                                                case 76:
                                                    fgtgVar = (fgtg) fdjl.a.iQ(7, null);
                                                    break;
                                                case 77:
                                                    fgtgVar = (fgtg) ekqs.a.iQ(7, null);
                                                    break;
                                                case 78:
                                                    fgtgVar = (fgtg) ekrs.a.iQ(7, null);
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    fgtgVar = (fgtg) ekrf.a.iQ(7, null);
                }
                if (fgtgVar == null || (bArr = this.g) == null) {
                    this.f = 1;
                    Log.e("ServerResponse", "Unknown proto class type for responseType=1");
                    return;
                }
                try {
                    this.i = fgtgVar.j(bArr);
                } catch (fgsd e2) {
                    this.f = 1;
                    Log.e("ServerResponse", "Failed to parse parcelable proto", e2);
                }
            }
        }
    }

    @Override // defpackage.dlpo
    public final boolean a() {
        return this.f == 22;
    }

    public final int b() {
        g();
        return this.f;
    }

    public final fgsz c() {
        g();
        return this.i;
    }

    public final boolean d() {
        g();
        return e(this.f);
    }

    public final byte[] f() {
        byte[] bArr = this.g;
        fgsz fgszVar = this.i;
        return fgszVar != null ? fgszVar.r() : bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fgsz fgszVar;
        this.g = f();
        if (this.h == null && (fgszVar = this.i) != null) {
            this.h = fgszVar.getClass().getName();
        }
        int a2 = atzr.a(parcel);
        atzr.o(parcel, 2, this.f);
        atzr.i(parcel, 3, this.g, false);
        atzr.v(parcel, 4, this.h, false);
        atzr.c(parcel, a2);
    }

    public ServerResponse(int i, fgsz fgszVar) {
        this.f = i;
        this.i = fgszVar;
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
