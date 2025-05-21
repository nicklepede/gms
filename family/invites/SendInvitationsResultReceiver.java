package com.google.android.gms.family.invites;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SendInvitationsResultReceiver extends ResultReceiver {
    public static final /* synthetic */ int a = 0;
    private final WeakReference b;

    public SendInvitationsResultReceiver(Handler handler, WeakReference weakReference) {
        super(handler);
        this.b = weakReference;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        SendInvitationsChimeraActivity sendInvitationsChimeraActivity = (SendInvitationsChimeraActivity) this.b.get();
        if (sendInvitationsChimeraActivity == null || sendInvitationsChimeraActivity.isFinishing()) {
            return;
        }
        int i2 = bundle.getInt("result-code");
        Contact contact = (Contact) bundle.getParcelable("contact");
        if (i2 == 2) {
            sendInvitationsChimeraActivity.o();
            return;
        }
        if (i2 != 3) {
            if (i2 == 4 && contact != null) {
                sendInvitationsChimeraActivity.s(contact);
                return;
            }
            return;
        }
        if (contact != null) {
            if (contact.b()) {
                sendInvitationsChimeraActivity.n(contact.d, false);
                if (sendInvitationsChimeraActivity.k(contact.d) < contact.h) {
                    return;
                }
            }
            sendInvitationsChimeraActivity.r(contact);
        }
    }
}
