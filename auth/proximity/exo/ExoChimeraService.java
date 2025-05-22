package com.google.android.gms.auth.proximity.exo;

import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.R;
import com.google.android.gms.auth.proximity.AttestationVerifier;
import com.google.android.gms.auth.proximity.ConnectionInfo;
import com.google.android.gms.auth.proximity.NearbyConnectionsIntentOperation;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.exo.ExoChimeraService;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import defpackage.a;
import defpackage.aecd;
import defpackage.aeek;
import defpackage.aegs;
import defpackage.aehq;
import defpackage.aehr;
import defpackage.aeih;
import defpackage.aeiq;
import defpackage.aeir;
import defpackage.aeis;
import defpackage.aeit;
import defpackage.aeiw;
import defpackage.aeiz;
import defpackage.aejf;
import defpackage.aejl;
import defpackage.aejm;
import defpackage.aejn;
import defpackage.aejy;
import defpackage.aekv;
import defpackage.aekx;
import defpackage.aelb;
import defpackage.aelg;
import defpackage.aelh;
import defpackage.aelj;
import defpackage.aenh;
import defpackage.aeqe;
import defpackage.aese;
import defpackage.aesn;
import defpackage.aetz;
import defpackage.aevm;
import defpackage.auad;
import defpackage.aupz;
import defpackage.bugy;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.elgo;
import defpackage.elpg;
import defpackage.eqex;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.fghf;
import defpackage.fgpr;
import defpackage.fgpx;
import defpackage.fgpy;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgti;
import defpackage.fgtq;
import defpackage.fguf;
import defpackage.fntv;
import defpackage.fnuf;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ExoChimeraService extends Service implements aegs {
    public static final auad a = new auad("ProximityAuth", "ExoService");
    private static final aejn f = new aejn(new aejl(AppContextProvider.a(), bugy.v()));
    public final aeih b;
    public final aeiw c;
    public final aeiz d;
    private final eqgo e;

    public ExoChimeraService() {
        this(new aupz(1, 10));
    }

    private final void b(final String str) {
        RemoteDevice b = aehr.c().b(str);
        if (b == null) {
            a.f("Can't find RemoteDevice for deviceId=%s", str);
            return;
        }
        final String str2 = b.d;
        final eqgl b2 = aevm.a(str2).b();
        b2.hD(new Runnable() { // from class: aejg
            @Override // java.lang.Runnable
            public final void run() {
                eqgl eqglVar = b2;
                String str3 = str;
                try {
                    aekw aekwVar = (aekw) eqgc.r(eqglVar);
                    aekw aekwVar2 = aekw.ACCESS_UNKNOWN;
                    String str4 = str2;
                    ExoChimeraService exoChimeraService = ExoChimeraService.this;
                    if (aekwVar == aekwVar2) {
                        exoChimeraService.a(str4);
                        return;
                    }
                    boolean z = aekwVar == aekw.ACCESS_GRANTED;
                    Boolean valueOf = Boolean.valueOf(z);
                    ExoChimeraService.a.h("Found exo association pref %s", valueOf);
                    aeiw aeiwVar = exoChimeraService.c;
                    valueOf.getClass();
                    aeir aeirVar = (aeir) aeiwVar.b.get(str3);
                    if (aeirVar != null) {
                        aeirVar.a(z, str4);
                    }
                    if (fntv.a.lK().i()) {
                        exoChimeraService.a(str4);
                    }
                } catch (ExecutionException e) {
                    ExoChimeraService.a.n("Failed to load exo association cache", e, new Object[0]);
                }
            }
        }, eqex.a);
    }

    public final void a(String str) {
        aeiw aeiwVar = this.c;
        if (!aeiwVar.e()) {
            aeiwVar.b();
        }
        aejf aejfVar = aeiwVar.c;
        if (aejfVar.q == null) {
            aejf.a.h("The signalingService is not ready to check CDM association, queue the CDM request.", new Object[0]);
            aejfVar.c.add(str);
        } else {
            try {
                aejfVar.q.a(str);
            } catch (RemoteException e) {
                aejf.a.g("Could not process checkCdmAssociation()", e, new Object[0]);
            }
        }
    }

    @Override // defpackage.aegs
    public final void d(String str, int i, int i2, int i3) {
        String str2;
        if (i != 5) {
            return;
        }
        a.h("Connection status changed from %s to %s for device %s", ConnectionInfo.a(i2), ConnectionInfo.a(i3), aeek.a(str));
        if (i3 != 3) {
            if (i3 == 0) {
                aeiw aeiwVar = this.c;
                aejf aejfVar = aeiwVar.c;
                aejfVar.f.remove(str);
                aejfVar.e.remove(str);
                aeir aeirVar = (aeir) aeiwVar.b.remove(str);
                if (aeirVar != null) {
                    aeir.a.h("close streamStatus=%d", Integer.valueOf(aeirVar.f));
                    int i4 = aeirVar.f;
                    if (i4 == 2 || i4 == 1) {
                        aeirVar.b.c(aeirVar.c);
                    }
                    aeirVar.e();
                }
                aeiwVar.d();
                return;
            }
            return;
        }
        aeiw aeiwVar2 = this.c;
        if (aeiwVar2.a(str) == null) {
            aeqe aeqeVar = new aeqe();
            aeqeVar.b("exo_connected_count");
            aeqeVar.c();
            aejf aejfVar2 = aeiwVar2.c;
            aejfVar2.f.put(str, new aeis(aeiwVar2, str));
            aejfVar2.e.put(str, new aeit(aeiwVar2, str));
            str2 = str;
            aeir aeirVar2 = new aeir(aejfVar2, str2, new aejy(), aeiwVar2.d, aeiwVar2.e);
            aejfVar2.h = aeirVar2;
            aeiwVar2.b.put(str2, aeirVar2);
        } else {
            str2 = str;
        }
        Map map = aeiwVar2.b;
        if (fnuf.q()) {
            aeiz.a.h("Enterprise policy - getAppStreamingPolicy(): %s (1=disabled, 2=enabled)", 0);
        }
        aeir aeirVar3 = (aeir) map.get(str2);
        if (aeirVar3 != null) {
            aeir.a.h("sendAppPolicyStateMessage", new Object[0]);
            fgrc v = aelb.a.v();
            if (!v.b.L()) {
                v.U();
            }
            ((aelb) v.b).b = 2;
            aelb aelbVar = (aelb) v.Q();
            fgrc v2 = aekx.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            String str3 = aeirVar3.c;
            aekx aekxVar = (aekx) v2.b;
            aelbVar.getClass();
            aekxVar.c = aelbVar;
            aekxVar.b = 10;
            aeiq.a(str3, (aekx) v2.Q());
        }
        b(str2);
    }

    @Override // com.google.android.chimera.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder("==== ExoService Dump ====\nisAdvertising: ");
        sb.append(NearbyConnectionsIntentOperation.b);
        sb.append("\nregisteredDevices: \n");
        Iterator it = this.b.b().iterator();
        while (it.hasNext()) {
            sb.append((RemoteDevice) it.next());
            sb.append("\n");
        }
        sb.append(this.c);
        sb.append("mendel flags: \nisExoAvailable(): false\nisExoHostSupported(): ");
        aejm.b();
        sb.append(true != fntv.g() ? "false" : "true");
        sb.append("\nsetExoHostSupported(): ");
        sb.append(true != fntv.h() ? "false" : "true");
        sb.append("\nenforceDeviceProximity(): ");
        sb.append(true != fntv.f() ? "false" : "true");
        sb.append("\nisAttestationEnforced(): ");
        sb.append(true == fntv.a.lK().g() ? "true" : "false");
        sb.append("\n");
        printWriter.append((CharSequence) sb.toString());
    }

    @Override // defpackage.aegs
    public final void e(String str, String str2, byte[] bArr) {
        int i;
        ekvi ekviVar;
        AttestationVerifier attestationVerifier;
        char c = 0;
        try {
            fgri y = fgri.y(fghf.a, bArr, 0, bArr.length, fgqp.a());
            fgri.M(y);
            fghf fghfVar = (fghf) y;
            a.d(a.C(fghfVar.b, "CDS_GMS_onMessageReceived WebRtcSignal session: "), new Object[0]);
            f.a(fghfVar, 14);
        } catch (fgsd e) {
            a.n("Failed to log incoming signaling message.", e, new Object[0]);
        }
        if (Objects.equals(str2, "eche")) {
            aeir a2 = this.c.a(str);
            int i2 = 1;
            if (a2 == null) {
                a.m("Received message for device with no registered connections. deviceId=%s", str);
                return;
            }
            if (fntv.a.lK().m()) {
                aehr c2 = aehr.c();
                synchronized (c2.c) {
                    aehq aehqVar = (aehq) c2.b.get(str);
                    if (aehqVar != null && (attestationVerifier = aehqVar.b) != null) {
                        ekviVar = ekvi.j(attestationVerifier);
                    }
                    ekviVar = ektg.a;
                }
                if (!ekviVar.h()) {
                    a.m("Received message for device with no attestation certificate available. deviceId=%s", str);
                    return;
                }
                AttestationVerifier attestationVerifier2 = (AttestationVerifier) ekviVar.c();
                int i3 = attestationVerifier2.d;
                if (i3 == 3) {
                    Log.e("AttestationVerifier", "Certificate previously failed to verify");
                } else {
                    if (i3 != 2 || attestationVerifier2.a()) {
                        int i4 = attestationVerifier2.b;
                        if (i4 == aesn.a(3)) {
                            byte[][] bArr2 = attestationVerifier2.a;
                            int length = bArr2.length;
                            if (length == 0) {
                                Log.e("AttestationVerifier", "No certificates to verify");
                            } else {
                                ArrayList arrayList = new ArrayList(length);
                                int i5 = 0;
                                while (true) {
                                    if (i5 < bArr2.length) {
                                        X509Certificate a3 = attestationVerifier2.c.a(bArr2[i5]);
                                        if (a3 == null) {
                                            Log.e("AttestationVerifier", "Could not convert the attestation data to a set of valid certificates");
                                            break;
                                        }
                                        arrayList.add(a3);
                                        elgo k = elgo.k(a3.getSubjectX500Principal().getName("CANONICAL").split(","));
                                        int basicConstraints = a3.getBasicConstraints();
                                        if (i5 == i2) {
                                            if (((elpg) k).c != 2 || !k.contains("o=chrome device soft bind") || !k.contains("cn=local authority")) {
                                                break;
                                            }
                                            if (!AttestationVerifier.b(a3.getKeyUsage(), 5)) {
                                                break;
                                            }
                                            if (basicConstraints != 0) {
                                                Log.e("AttestationVerifier", "Penultimate cert PathLen constraint is incorrect");
                                                break;
                                            } else {
                                                i5++;
                                                i2 = 1;
                                            }
                                        } else if (i5 == 0) {
                                            if (((elpg) k).c != 2 || !k.contains("o=chrome device soft bind") || !k.contains("cn=cryptauth user key")) {
                                                break;
                                            }
                                            if (!AttestationVerifier.b(a3.getKeyUsage(), 0)) {
                                                break;
                                            }
                                            if (basicConstraints != -1) {
                                                Log.e("AttestationVerifier", "Leaf cert PathLen constraint is incorrect");
                                                break;
                                            } else if (a3.getNotAfter().getTime() - a3.getNotBefore().getTime() > 259200000) {
                                                Log.e("AttestationVerifier", "Leaf cert issued for longer than allowed period");
                                                break;
                                            } else {
                                                i5++;
                                                i2 = 1;
                                            }
                                        } else if (basicConstraints == 0) {
                                            Log.e("AttestationVerifier", "Multiple or misplaced terminal local ca cert(s)");
                                            break;
                                        } else {
                                            i5++;
                                            i2 = 1;
                                        }
                                    } else {
                                        aecd aecdVar = attestationVerifier2.c;
                                        TrustAnchor trustAnchor = aecdVar.b;
                                        if (trustAnchor == null || !aecdVar.b(arrayList, trustAnchor)) {
                                            Log.e("AttestationVerifier", "Could not validate chain");
                                        } else {
                                            Log.i("AttestationVerifier", "CROS_SOFT_BIND certificate verified");
                                            attestationVerifier2.d = 2;
                                        }
                                    }
                                }
                            }
                            Log.e("AttestationVerifier", "CROS_SOFT_BIND certificate NOT verified");
                        } else {
                            Log.e("AttestationVerifier", a.j(i4, "Not possible to perform verification for this type: "));
                        }
                    } else {
                        Log.e("AttestationVerifier", "Certificate is now outside the validity period");
                    }
                    attestationVerifier2.d = 3;
                }
                a.m("Received message for device which failed the attestation check. deviceId=%s", str);
                return;
            }
            try {
                fgpr w = fgpr.w(bArr);
                fgqp a4 = fgqp.a();
                aekx aekxVar = aekx.a;
                fgpx k2 = w.k();
                fgri x = aekxVar.x();
                try {
                    try {
                        fgtq b = fgti.a.b(x);
                        b.l(x, fgpy.p(k2), a4);
                        b.g(x);
                        try {
                            k2.z(0);
                            fgri.M(x);
                            aekx aekxVar2 = (aekx) x;
                            int i6 = aekxVar2.b;
                            switch (i6) {
                                case 0:
                                    i = 11;
                                    break;
                                case 1:
                                    i = 1;
                                    break;
                                case 2:
                                    i = 2;
                                    break;
                                case 3:
                                    i = 3;
                                    break;
                                case 4:
                                    i = 4;
                                    break;
                                case 5:
                                    i = 5;
                                    break;
                                case 6:
                                    i = 6;
                                    break;
                                case 7:
                                    i = 7;
                                    break;
                                case 8:
                                    i = 8;
                                    break;
                                case 9:
                                    i = 9;
                                    break;
                                case 10:
                                    i = 10;
                                    break;
                                default:
                                    i = 0;
                                    break;
                            }
                            int i7 = i - 1;
                            if (i == 0) {
                                throw null;
                            }
                            if (i7 == 0) {
                                aeiw aeiwVar = this.c;
                                if (!aeiwVar.e()) {
                                    aeiwVar.b();
                                }
                                aeir.a.h("Received signaling message: ".concat(String.valueOf(String.valueOf(aekxVar2))), new Object[0]);
                                new aeqe().B("exo_message_received", 0);
                                aejf aejfVar = a2.b;
                                String str3 = a2.c;
                                fgpr fgprVar = (aekxVar2.b == 1 ? (aelh) aekxVar2.c : aelh.a).b;
                                if (fgprVar.K()) {
                                    aejf.a.f("Could not process received request as it is empty", new Object[0]);
                                } else {
                                    aejfVar.b.add(new aekv(str3, fgprVar));
                                    aejfVar.a(aejfVar.k);
                                }
                                int i8 = a2.f;
                                if (i8 == 0 || i8 == 3) {
                                    a2.f = 1;
                                    return;
                                }
                                return;
                            }
                            if (i7 == 6) {
                                a.h("Received APPS_ACCESS_STATE_REQUEST for deviceId=%s", str);
                                b(str);
                                return;
                            }
                            if (i7 == 8) {
                                int i9 = (i6 == 9 ? (aelj) aekxVar2.c : aelj.a).b;
                                char c3 = i9 != 0 ? i9 != 1 ? i9 != 2 ? (char) 0 : (char) 4 : (char) 3 : (char) 2;
                                if (c3 != 0 && c3 == 3) {
                                    aeir.a.h("Received stream start message: ".concat(String.valueOf(String.valueOf(aekxVar2))), new Object[0]);
                                    return;
                                } else {
                                    aeir.a.h("Received stream stop message: ".concat(String.valueOf(String.valueOf(aekxVar2))), new Object[0]);
                                    return;
                                }
                            }
                            if (i7 == 2) {
                                int i10 = (i6 == 3 ? (aelg) aekxVar2.c : aelg.a).b;
                                if (i10 == 0) {
                                    c = 2;
                                } else if (i10 == 1) {
                                    c = 3;
                                }
                                if (c == 0 || c != 3) {
                                    return;
                                }
                                aeiw aeiwVar2 = this.c;
                                if (!aeiwVar2.e() || fntv.f()) {
                                    return;
                                }
                                aeiwVar2.c();
                                return;
                            }
                            if (i7 == 3) {
                                if (fntv.e()) {
                                    a.h("Received proximity ping for device %s", str);
                                }
                                if (fntv.f()) {
                                    aejy aejyVar = a2.d;
                                    if (aejyVar.c()) {
                                        int i11 = aejyVar.d;
                                        if (i11 == 3 || i11 == 4 || i11 == 5) {
                                            aejyVar.d = 2;
                                        }
                                        aejyVar.c = SystemClock.elapsedRealtime() + 300000;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            if (i7 != 4) {
                                a.m("Received unsupported message type for deviceId=%s", str);
                                return;
                            }
                            auad auadVar = a;
                            auadVar.h("Received SEND_APPS_SETUP_REQUEST for deviceId=%s", str);
                            aeiw aeiwVar3 = this.c;
                            if (!aeiwVar3.e()) {
                                aeiwVar3.b();
                            }
                            RemoteDevice b2 = aehr.c().b(str);
                            if (b2 == null) {
                                auadVar.m("Cannot get RemoteDevice for deviceId=%s", str);
                                return;
                            }
                            String string = getString(R.string.proximity_auth_chromebook);
                            aejf aejfVar2 = aeiwVar3.c;
                            aenh aenhVar = aejfVar2.q;
                            String str4 = b2.d;
                            if (aenhVar == null) {
                                aejf.a.h("The signalingService is not ready to start CDM association, queue the CDM request.", new Object[0]);
                                aejfVar2.d.put(str4, string);
                            } else {
                                try {
                                    aejfVar2.q.b(str4, string);
                                } catch (RemoteException e2) {
                                    aejf.a.g("Could not process startCdmAssociation()", e2, new Object[0]);
                                }
                            }
                        } catch (fgsd e3) {
                            throw e3;
                        }
                    } catch (fgsd e4) {
                        if (!e4.a) {
                            throw e4;
                        }
                        throw new fgsd(e4);
                    } catch (IOException e5) {
                        if (!(e5.getCause() instanceof fgsd)) {
                            throw new fgsd(e5);
                        }
                        throw ((fgsd) e5.getCause());
                    }
                } catch (fguf e6) {
                    throw e6.a();
                } catch (RuntimeException e7) {
                    if (!(e7.getCause() instanceof fgsd)) {
                        throw e7;
                    }
                    throw ((fgsd) e7.getCause());
                }
            } catch (fgsd e8) {
                a.n("Failed to parse incoming message from deviceId=".concat(String.valueOf(str)), e8, new Object[0]);
            }
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        aeiw aeiwVar = this.c;
        aeiwVar.c();
        aeiwVar.b.clear();
        aeiwVar.f(true);
        this.b.c(this);
        aese aeseVar = this.d.d;
        this.e.shutdown();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        aejm.b();
        new aeqe().B("start_exo_service_result", 1);
        stopSelf();
        return 2;
    }

    public ExoChimeraService(aeih aeihVar, eqgo eqgoVar, aeiw aeiwVar, aeiz aeizVar) {
        this.b = aeihVar;
        this.e = eqgoVar;
        this.c = aeiwVar;
        this.d = aeizVar;
    }

    private ExoChimeraService(eqgo eqgoVar) {
        this(new aeih("eche"), eqgoVar, new aeiw(new aejf(AppContextProvider.a(), eqgoVar, f), fnuf.p() ? aetz.b(AppContextProvider.a()) : null, eqgoVar), new aeiz(AppContextProvider.a()));
    }
}
