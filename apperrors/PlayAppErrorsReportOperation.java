package com.google.android.gms.apperrors;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import com.google.android.finsky.apperrors.PlayAppErrorReport;
import com.google.android.finsky.updateprompt.PlayAppFilteredError;
import defpackage.aqsz;
import defpackage.aqup;
import defpackage.arwm;
import defpackage.arxd;
import defpackage.asej;
import defpackage.asiu;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.otm;
import defpackage.oto;
import defpackage.rll;
import defpackage.rlp;
import java.util.logging.Level;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PlayAppErrorsReportOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final asot b = asot.b("PlayAppErrorsReportOperation", asej.STATS);
    private static final Intent c = new Intent("com.google.android.finsky.BIND_APP_ERROR_SERVICE").setPackage("com.android.vending");
    private static final Intent d = new Intent("com.google.android.finsky.BIND_APP_FILTERED_ERROR_SERVICE").setPackage("com.android.vending");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        aqsz aqszVar;
        if (!aqup.d(this).h("com.android.vending")) {
            ((ejhf) b.f(Level.WARNING).ah(458)).x("Could not verify Play Store signature");
            return;
        }
        otm otmVar = null;
        if ("com.google.android.gms.apperrors.PLAY_APP_ERRORS_REPORT_ACTION".equals(intent.getAction())) {
            PlayAppErrorReport playAppErrorReport = (PlayAppErrorReport) arxd.b(intent, "report", PlayAppErrorReport.CREATOR);
            arwm.s(playAppErrorReport);
            aqszVar = new aqsz();
            try {
                try {
                    if (asiu.a().d(this, c, aqszVar, 1)) {
                        IBinder a2 = aqszVar.a();
                        if (a2 != null) {
                            IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.finsky.apperrors.IPlayAppErrorsService");
                            otmVar = queryLocalInterface instanceof rll ? (rll) queryLocalInterface : new rll(a2);
                        }
                        if (otmVar == null) {
                            ((ejhf) b.f(Level.WARNING).ah(462)).x("Connection failed");
                            return;
                        }
                        Parcel fr = otmVar.fr();
                        oto.e(fr, playAppErrorReport);
                        otmVar.fu(1, fr);
                        return;
                    }
                    return;
                } catch (RemoteException | InterruptedException e) {
                    ((ejhf) ((ejhf) b.f(Level.WARNING).s(e)).ah(461)).x("Service call failed");
                    return;
                }
            } finally {
            }
        }
        if (!"com.google.android.gms.apperrors.PLAY_APP_FILTERED_ERROR_ACTION".equals(intent.getAction())) {
            ((ejhf) b.f(Level.WARNING).ah(457)).B("Unknown intent action '%s'", intent.getAction());
            return;
        }
        PlayAppFilteredError playAppFilteredError = (PlayAppFilteredError) arxd.b(intent, "error", PlayAppFilteredError.CREATOR);
        arwm.s(playAppFilteredError);
        aqszVar = new aqsz();
        try {
            try {
                if (asiu.a().d(this, d, aqszVar, 1)) {
                    IBinder a3 = aqszVar.a();
                    if (a3 != null) {
                        IInterface queryLocalInterface2 = a3.queryLocalInterface("com.google.android.finsky.updateprompt.IPlayAppFilteredErrorsService");
                        otmVar = queryLocalInterface2 instanceof rlp ? (rlp) queryLocalInterface2 : new rlp(a3);
                    }
                    if (otmVar == null) {
                        ((ejhf) b.f(Level.WARNING).ah(460)).x("Connection failed");
                        return;
                    }
                    Parcel fr2 = otmVar.fr();
                    oto.e(fr2, playAppFilteredError);
                    otmVar.fu(1, fr2);
                }
            } catch (RemoteException | InterruptedException e2) {
                ((ejhf) ((ejhf) b.f(Level.WARNING).s(e2)).ah(459)).x("Service call failed");
            }
        } finally {
        }
    }
}
