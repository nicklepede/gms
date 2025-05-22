package com.google.android.gms.wallet.ui.verifypin;

import android.accounts.Account;
import android.content.Context;
import android.graphics.PorterDuff;
import android.media.AudioManager;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenRequest;
import com.google.android.gms.wallet.ui.verifypin.KeyPadView;
import defpackage.dluf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class KeyPadView extends LinearLayout {
    public dluf a;

    public KeyPadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.wallet_view_keypad, (ViewGroup) this, true);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: dlub
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dluf dlufVar = KeyPadView.this.a;
                if (dlufVar == null) {
                    return;
                }
                int charAt = ((TextView) view).getText().charAt(0) - '0';
                if (dlufVar.c.length() < 4) {
                    dlufVar.d.setVisibility(4);
                    dlufVar.c.append(charAt);
                    dlufVar.i.c(dlufVar.c.length());
                    if (dlufVar.c.length() == 4) {
                        dlufVar.m(false);
                        dlufVar.i.b(1);
                        String sb = dlufVar.c.toString();
                        Account j = dlufVar.j();
                        int i = dlufVar.f;
                        dlufVar.f = i + 1;
                        ReauthProofTokenRequest reauthProofTokenRequest = new ReauthProofTokenRequest(j, sb, 2, i);
                        dlufVar.e = ehnw.n(dlufVar.b, 6);
                        dlufVar.k().b.m(reauthProofTokenRequest);
                    }
                }
            }
        };
        findViewById(R.id.keypad_button_0).setOnClickListener(onClickListener);
        findViewById(R.id.keypad_button_1).setOnClickListener(onClickListener);
        findViewById(R.id.keypad_button_2).setOnClickListener(onClickListener);
        findViewById(R.id.keypad_button_3).setOnClickListener(onClickListener);
        findViewById(R.id.keypad_button_4).setOnClickListener(onClickListener);
        findViewById(R.id.keypad_button_5).setOnClickListener(onClickListener);
        findViewById(R.id.keypad_button_6).setOnClickListener(onClickListener);
        findViewById(R.id.keypad_button_7).setOnClickListener(onClickListener);
        findViewById(R.id.keypad_button_8).setOnClickListener(onClickListener);
        findViewById(R.id.keypad_button_9).setOnClickListener(onClickListener);
        ((ImageButton) findViewById(R.id.keypad_button_back)).setOnClickListener(new View.OnClickListener() { // from class: dluc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dluf dlufVar = KeyPadView.this.a;
                if (dlufVar.c.length() > 0) {
                    dlufVar.d.setVisibility(4);
                    dlufVar.c.deleteCharAt(r0.length() - 1);
                    dlufVar.i.c(dlufVar.c.length());
                }
            }
        });
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (audioManager.isWiredHeadsetOn() || audioManager.isBluetoothA2dpOn() || Settings.Secure.getInt(getContext().getContentResolver(), "speak_password", 0) != 0) {
            return;
        }
        findViewById(R.id.keypad_button_0).setContentDescription(getResources().getString(R.string.wallet_dot_active));
        findViewById(R.id.keypad_button_1).setContentDescription(getResources().getString(R.string.wallet_dot_active));
        findViewById(R.id.keypad_button_2).setContentDescription(getResources().getString(R.string.wallet_dot_active));
        findViewById(R.id.keypad_button_3).setContentDescription(getResources().getString(R.string.wallet_dot_active));
        findViewById(R.id.keypad_button_4).setContentDescription(getResources().getString(R.string.wallet_dot_active));
        findViewById(R.id.keypad_button_5).setContentDescription(getResources().getString(R.string.wallet_dot_active));
        findViewById(R.id.keypad_button_6).setContentDescription(getResources().getString(R.string.wallet_dot_active));
        findViewById(R.id.keypad_button_7).setContentDescription(getResources().getString(R.string.wallet_dot_active));
        findViewById(R.id.keypad_button_8).setContentDescription(getResources().getString(R.string.wallet_dot_active));
        findViewById(R.id.keypad_button_9).setContentDescription(getResources().getString(R.string.wallet_dot_active));
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        findViewById(R.id.keypad_button_0).setEnabled(z);
        findViewById(R.id.keypad_button_1).setEnabled(z);
        findViewById(R.id.keypad_button_2).setEnabled(z);
        findViewById(R.id.keypad_button_3).setEnabled(z);
        findViewById(R.id.keypad_button_4).setEnabled(z);
        findViewById(R.id.keypad_button_5).setEnabled(z);
        findViewById(R.id.keypad_button_6).setEnabled(z);
        findViewById(R.id.keypad_button_7).setEnabled(z);
        findViewById(R.id.keypad_button_8).setEnabled(z);
        findViewById(R.id.keypad_button_9).setEnabled(z);
        ImageButton imageButton = (ImageButton) findViewById(R.id.keypad_button_back);
        imageButton.setEnabled(z);
        if (z) {
            imageButton.clearColorFilter();
        } else {
            imageButton.setColorFilter(-7829368, PorterDuff.Mode.SRC_ATOP);
        }
    }
}
